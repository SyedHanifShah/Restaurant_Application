package com.corn.cornpos.ui.screen.pin


import android.content.Context
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.datastore.dataStore
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.corn.cornpos.data.CornPosDataStore
import com.corn.cornpos.repository.CornPosRepository
import com.corn.cornpos.util.NavigationScreen
import com.corn.cornpos.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class PinViewModel @Inject constructor(
    private val repository: CornPosRepository,
    @ApplicationContext application: Context
) :ViewModel(){

    private val dataStore = CornPosDataStore(application)
    val _PIN = dataStore.getPIN
    var PIN by mutableStateOf("")
    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    var circleProgress by mutableStateOf(false)



init {

    viewModelScope.launch {
        _PIN.collect{
            if (it != null) {
                PIN = it
            }
        }
    }


}




    fun onEvent(event: PinEvents){
        when(event){
            is PinEvents.OnPinChange->{

                PIN = event.pin
            }
            is PinEvents.OnNextClick->{
            if (PIN.isNotBlank()){
                circleProgress = true
                viewModelScope.launch {
                dataStore.savePIN(PIN)
                }
                viewModelScope.launch {
                    try {
                        val res = repository.pinValidation(PIN)
                        if (res.isSuccessful){

                            if (res.body()?.Status == true){
                                res.body()?.ClientConnString?.let {
                                    dataStore.savedClientConnString(it)
                                }
                                circleProgress = false
                                sentUiEvent(UiEvent.Navigate(NavigationScreen.Login.route))
                            }else{
                                circleProgress = false
                                sentUiEvent(UiEvent.ShowSnackBar(
                                    message = "Please enter the correct PIN."
                                ))

                            }
                        }else{
                            circleProgress = false
                            sentUiEvent(UiEvent.ShowSnackBar(
                                message = "Please enter the correct PIN."
                            ))
                        }

                    }catch (e:Exception){
                        e.printStackTrace()
                    }

                }

            }

            }
        }

    }

    private fun sentUiEvent(event: UiEvent){
        viewModelScope.launch {
            _uiEvent.send(event)
        }
    }



}