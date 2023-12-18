package com.corn.cornpos.ui.screen.takeaway

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.corn.cornpos.data.CornPosDataStore
import com.corn.cornpos.data.database.Deals
import com.corn.cornpos.data.database.LoginModel
import com.corn.cornpos.data.database.OrderDetails
import com.corn.cornpos.data.database.UserInfoModel
import com.corn.cornpos.data.remote.dto.DashboardDto
import com.corn.cornpos.data.remote.dto.DashboardPayload
import com.corn.cornpos.data.remote.dto.Parameters
import com.corn.cornpos.repository.CornDataBaseRepository
import com.corn.cornpos.repository.CornPosRepository
import com.corn.cornpos.util.NavigationScreen
import com.corn.cornpos.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import javax.inject.Inject


@HiltViewModel
class TakeAwayViewModel @Inject constructor(
    private val repository: CornPosRepository,
    val dataBaseRepository: CornDataBaseRepository,
    @ApplicationContext application: Context
) : ViewModel() {


    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()
    var loadingDataFromApi by mutableStateOf(false)
    val _loginDatabaseData = dataBaseRepository.getAllLoginData()
    var loginDatabaseData by mutableStateOf<LoginModel?>(null)
    val _userInfoDatabaseData = dataBaseRepository.getAllUserInfo()
    var userInfoDatabaseData by mutableStateOf<UserInfoModel?>(null)
    val dataStore = CornPosDataStore(application)
    private val _clientConnString = dataStore.getClientConnString
    var clientConnString by mutableStateOf("")

    private val _isTableScreen = dataStore.isTableScreen
    var isTableScreen by mutableStateOf(false)
    var dashboardDataFromApi by mutableStateOf<DashboardDto?>(null)


    val _canDineIn = dataStore.getCanDineIn

    var canDineIn by
    mutableStateOf(false)
    var _order = dataBaseRepository.getAllOrder()
    var orderList by mutableStateOf<List<OrderDetails>>(emptyList())
    var alreadyAddedOrder = mutableStateListOf<OrderDetails?>(null)

    var _deals = dataBaseRepository.getAllDeals()
    var dealsList by mutableStateOf<List<Deals>>(emptyList())

    val _canDelivery = dataStore.getCanDelivery

    var canDelivery by
    mutableStateOf(false)


    val _canTakeAway = dataStore.getCanTakeAway

    var canTakeAway by
    mutableStateOf(false)



    init {
        viewModelScope.launch {
            dataStore.saveIsTableScreen(false)
            dataStore.saveCanDelivery(false)
            dataStore.saveCanDineIn(false)
            dataStore.saveCanTakeAway(false)
        }

        loadingDataFromApi = true
        viewModelScope.launch {
            try {
                _loginDatabaseData.collect {
                    loginDatabaseData = it
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }


        viewModelScope.launch {
            try {
                _userInfoDatabaseData.collect {
                    userInfoDatabaseData = it
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        viewModelScope.launch {
            try {
                _clientConnString.collect {
                    if (it != null) {
                        clientConnString = it
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }

        viewModelScope.launch {
            try {
                _isTableScreen.collect {
                    if (it != null) {
                        isTableScreen = it
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }


        viewModelScope.launch {
            delay(1000)
            try {
                val res = repository.dashboard(
                    xConn = clientConnString,
                    authorization = "${loginDatabaseData?.Token_Type} ${loginDatabaseData?.Access_Token}",
                    payload = DashboardPayload(
                        SpName = "uspGetPendingOrderOfflineMode",
                        Parameters = Parameters(DistributorID = userInfoDatabaseData?.DistributionID.toString())
                    )
                )
                if (res.isSuccessful) {
                    loadingDataFromApi = false
                    val body = res.body()
                    if (body?.Status == true) {
                        loadingDataFromApi = false
                        dashboardDataFromApi = body
                    } else {
                        loadingDataFromApi = false
                        sentUiEvent(
                            UiEvent.ShowSnackBar(
                                message = res.message()
                            )
                        )
                    }
                }else {
                    loadingDataFromApi = false
                    sentUiEvent(
                        UiEvent.ShowSnackBar(
                            message = res.message()
                        )
                    )
                }

            } catch (e: UnknownHostException) {
                // show "Check Internet Connection" message
                loadingDataFromApi = false
                sentUiEvent(
                    UiEvent.ShowSnackBar(
                        message = "Check Internet Connection"
                    )
                )
            } catch (e: SocketTimeoutException) {
                // show "Check Internet Connection" message
                loadingDataFromApi = false
                sentUiEvent(
                    UiEvent.ShowSnackBar(
                        message = "Check Internet Connection"
                    )
                )
            } catch (e: Exception) {
                // show other error message
                loadingDataFromApi = false
                e.message?.let {
                    UiEvent.ShowSnackBar(
                        message = it
                    )
                }?.let {
                    sentUiEvent(
                        it
                    )
                }
            }

        }

        viewModelScope.launch {
            try {
                _canDineIn.collect{
                    if (it != null) {
                        canDineIn = it
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }



        viewModelScope.launch {
            try {
                _canTakeAway.collect {
                    if (it != null) {
                        canTakeAway = it
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }


        viewModelScope.launch {
            try {
                _canDelivery.collect {
                    if (it != null) {
                        canDelivery = it
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }


        viewModelScope.launch {
            _deals.collect{list->
                dealsList = list
            }

        }


        viewModelScope.launch {
            try {
                _order.collect{
                    orderList = it
                }

            }catch (e:Exception){
                e.printStackTrace()
            }
        }



    }






    fun onEvent(event: TakeAwayEvents) {
        when (event) {
            is TakeAwayEvents.OnNewOrderClick -> {
                viewModelScope.launch {
                    dataStore.saveCanTakeAway(true)
                    dataStore.saveServiceTypeID(3)
                    dataStore.savedSelectedTableName("")
                    dataStore.savedCoverTableFloor("")
                    dataStore.savedTakeAwayTitle("Take Away")
                    dataStore.savedCoverTable(0)
                    dataStore.savedSelectedTable(0)
                }
                sentUiEvent(UiEvent.Navigate(NavigationScreen.MenuScreen.route))

            }

            else -> {}
        }
    }


    private fun sentUiEvent(event: UiEvent) {
        viewModelScope.launch {
            _uiEvent.send(event)
        }
    }


    fun refreshData(){

        viewModelScope.launch {
            dataStore.saveIsTableScreen(false)
            dataStore.saveCanDelivery(false)
            dataStore.saveCanDineIn(false)
            dataStore.saveCanTakeAway(false)
        }

            loadingDataFromApi = true
            viewModelScope.launch {
                try {
                    _loginDatabaseData.collect {
                        loginDatabaseData = it
                    }

                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }


            viewModelScope.launch {
                try {
                    _userInfoDatabaseData.collect {
                        userInfoDatabaseData = it
                    }

                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }

            viewModelScope.launch {
                try {
                    _clientConnString.collect {
                        if (it != null) {
                            clientConnString = it
                        }
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }


            viewModelScope.launch {
                delay(1000)
                try {
                    val res = repository.dashboard(
                        xConn = clientConnString,
                        authorization = "${loginDatabaseData?.Token_Type} ${loginDatabaseData?.Access_Token}",
                        payload = DashboardPayload(
                            SpName = "uspGetPendingOrderOfflineMode",
                            Parameters = Parameters(DistributorID = userInfoDatabaseData?.DistributionID.toString())
                        )
                    )
                    if (res.isSuccessful) {
                        loadingDataFromApi = false
                        val body = res.body()
                        if (body?.Status == true) {
                            loadingDataFromApi = false
                            dashboardDataFromApi = body
                        } else {
                            loadingDataFromApi = false
                            sentUiEvent(
                                UiEvent.ShowSnackBar(
                                    message = res.message()
                                )
                            )
                        }
                    } else {
                        loadingDataFromApi = false
                        sentUiEvent(
                            UiEvent.ShowSnackBar(
                                message = "Check Internet Connection"
                            )
                        )
                    }

                }catch (e: UnknownHostException) {
                    // show "Check Internet Connection" message
                    loadingDataFromApi = false
                    sentUiEvent(
                        UiEvent.ShowSnackBar(
                            message = "Check Internet Connection"
                        )
                    )
                } catch (e: SocketTimeoutException) {
                    // show "Check Internet Connection" message
                    loadingDataFromApi = false
                    sentUiEvent(
                        UiEvent.ShowSnackBar(
                            message = "Check Internet Connection"
                        )
                    )
                } catch (e: Exception) {
                    // show other error message
                    loadingDataFromApi = false
                    e.message?.let {
                        UiEvent.ShowSnackBar(
                            message = it
                        )
                    }?.let {
                        sentUiEvent(
                            it
                        )
                    }
                }

            }
        }



    fun checkOrderList(dealIdL: Int): Boolean {
        return alreadyAddedOrder.firstOrNull { it?.itemId == dealIdL } != null
    }

}