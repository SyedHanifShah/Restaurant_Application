package com.corn.cornpos.ui.screen.table

import android.content.Context
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.corn.cornpos.data.CornPosDataStore
import com.corn.cornpos.data.database.Customer
import com.corn.cornpos.data.database.LoginModel
import com.corn.cornpos.data.database.OrderDetails
import com.corn.cornpos.data.database.Table
import com.corn.cornpos.data.database.UserInfoModel
import com.corn.cornpos.data.remote.dto.DashboardPayload
import com.corn.cornpos.data.remote.dto.MasterData
import com.corn.cornpos.data.remote.dto.MasterRow
import com.corn.cornpos.data.remote.dto.Parameters
import com.corn.cornpos.repository.CornDataBaseRepository
import com.corn.cornpos.repository.CornPosRepository
import com.corn.cornpos.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import javax.inject.Inject


@HiltViewModel
class TableViewModel @Inject constructor(
    private val repository: CornPosRepository,
    private val dataBaseRepository: CornDataBaseRepository,
    @ApplicationContext application: Context
) :ViewModel(){

    val dataStore = CornPosDataStore(application)
    var loadingDataFromApi by mutableStateOf(false)
    val _loginDatabaseData = dataBaseRepository.getAllLoginData()
    var loginDatabaseData by mutableStateOf<LoginModel?>(null)

    val _tableDatabaseData = dataBaseRepository.getAllTableData()
    var tableDatabaseData by mutableStateOf<List<Table>>(emptyList())

    val _customerDatabaseData = dataBaseRepository.getAllCustomer()
    var customerDatabaseData by mutableStateOf<List<Customer>>(emptyList())


    val _userInfoDatabaseData = dataBaseRepository.getAllUserInfo()
    var userInfoDatabaseData by mutableStateOf<UserInfoModel?>(null)
    private val _clientConnString = dataStore.getClientConnString
    var clientConnString by mutableStateOf("")
    var masterDataFromApi by mutableStateOf<MasterData?>(null)
    private val _selectedTable = dataStore.getSelectedTable
    var selectedTable by mutableStateOf(0)
    private val _selectedTableName = dataStore.getSelectedTableName
    var selectedTableName by mutableStateOf("")
    private val _selectedTableList = dataStore.readList()
    var selectedTableList by mutableStateOf<List<String>>(emptyList())

    private val _isTableAlreadySelected = dataStore.getIsTableAlreadySelected
    var isTableAlreadySelected by mutableStateOf(false)

    private val _coverTable = dataStore.getCoverTable
    var coverTable by mutableStateOf(0)
    var editCoverTable by mutableStateOf("")

    var tablesList by mutableStateOf<List<MasterRow>>(emptyList())
    var tablist = mutableListOf<String>()
    var _order = dataBaseRepository.getAllOrder()
    var orderList by mutableStateOf<List<OrderDetails>>(emptyList())

    var pages = mutableStateOf<List<String>>(listOf(
        "All",
        "Ground",
        "1st Floor",
        "2nd Floor",
        "Roof Top"))

    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()
    var customerNameList = mutableStateListOf<MasterRow>()




    init {


        loadingDataFromApi = true
        viewModelScope.launch {
            try {
                _loginDatabaseData.collect{
                    loginDatabaseData = it
                }

            }catch (e:Exception){
                e.printStackTrace()
            }
        }

        viewModelScope.launch {
            try {
                _coverTable.collect{
                    if (it != null) {
                        coverTable = it
                        editCoverTable = it.toString()
                    }
                }

            }catch (e:Exception){
                e.printStackTrace()
            }
        }


        viewModelScope.launch {
            try {
                _userInfoDatabaseData.collect{
                    userInfoDatabaseData = it
                }

            }catch (e:Exception){
                e.printStackTrace()
            }
        }

        viewModelScope.launch {
            try {
                loadingDataFromApi = true
                _tableDatabaseData.collect{
                    tableDatabaseData = it

                    tablist.add(0 , "All")
                    tableDatabaseData.forEach {
                        val newItem = it.FloorName
                        val existingIndex = tablist.indexOf(newItem)
                        if (existingIndex >= 0){
                        } else {
                                if (newItem != ""){
                                    tablist.add(newItem)
                                }

                        }
                    }
                    pages.value = tablist
                    loadingDataFromApi = false

                }

            }catch (e:Exception){
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
                _order.collect{
                    orderList = it
                }

            }catch (e:Exception){
                e.printStackTrace()
            }
        }


        viewModelScope.launch {
            try {
                _selectedTable.collect {
                    if (it != null) {
                        selectedTable = it
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }

        viewModelScope.launch {
            try {
                _selectedTableName.collect {
                    if (it != null) {
                        selectedTableName = it
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }


        viewModelScope.launch {
            try {
                _selectedTableList.collect {
                    if (it != null) {
                        selectedTableList = it
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }

        viewModelScope.launch {
            try {
                _isTableAlreadySelected.collect{
                    if (it != null) {
                        isTableAlreadySelected = it
                    }
                }


            }catch (e:Exception){
                e.printStackTrace()
            }
        }

        viewModelScope.launch {
            delay(1000)
            try {
                val res = repository.masterData(
                    xConn = clientConnString,
                    authorization = "${loginDatabaseData?.Token_Type} ${loginDatabaseData?.Access_Token}",
                    payload = DashboardPayload(
                        SpName = "uspGetAllMasterDataApi",
                        Parameters = Parameters(DistributorID = userInfoDatabaseData?.DistributionID.toString())
                    )
                )
                if (res.isSuccessful){
                    val body = res.body()
                    if (body?.Status == true){

                        body.Rows.get(0).forEach {
                            customerNameList.add(it)
                        }

                        masterDataFromApi = body
                    }else{
                        loadingDataFromApi = false
                        sentUiEvent(UiEvent.ShowSnackBar(
                            message = res.message()
                        ))
                    }
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



    fun onEvent(event: TableEvents) {
        when (event) {
            is TableEvents.OnTableSelection -> {
                viewModelScope.launch {
                    dataStore.savedSelectedTable(event.table)
                    dataStore.savedCoverTableFloor(event.floorName)
                    dataStore.savedSelectedTableName(event.tableName)
                    dataStore.savesTableAlreadySelected(true)
                }
            }
            is TableEvents.OnCoverTableChange->{
                viewModelScope.launch {
                    dataStore.savedCoverTable(event.cover)
                }
            }
            is TableEvents.OnNameSearched->{
                viewModelScope.launch {
                    dataStore.savedCustomerName(event.name)
                    dataStore.savedCustomerID(event.id)
                }
            }
            is TableEvents.OnTableUnSelection->{
                viewModelScope.launch {
                    dataStore.savedSelectedTable(0)
                    dataStore.savedSelectedTableName("")
                }
            }


            else -> {}
        }
    }



    private fun sentUiEvent(event: UiEvent){
        viewModelScope.launch {
            _uiEvent.send(event)
        }
    }



}




