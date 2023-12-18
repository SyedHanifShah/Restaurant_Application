package com.corn.cornpos.ui.screen.orderDetail

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.corn.cornpos.data.CornPosDataStore
import com.corn.cornpos.data.database.Deals
import com.corn.cornpos.data.database.LoginModel
import com.corn.cornpos.data.database.OrderDetails
import com.corn.cornpos.data.database.UserInfoModel
import com.corn.cornpos.data.remote.dto.Deal
import com.corn.cornpos.data.remote.dto.DealAndItems
import com.corn.cornpos.data.remote.dto.DealItem
import com.corn.cornpos.data.remote.dto.JsonString
import com.corn.cornpos.data.remote.dto.Order
import com.corn.cornpos.data.remote.dto.OrderItems
import com.corn.cornpos.data.remote.dto.OrderParameters
import com.corn.cornpos.data.remote.dto.Payload
import com.corn.cornpos.data.remote.dto.TableDetailsDto
import com.corn.cornpos.repository.CornDataBaseRepository
import com.corn.cornpos.repository.CornPosRepository
import com.corn.cornpos.ui.screen.dashboard.DashboardViewModel
import com.corn.cornpos.ui.screen.menu.MenuEvents
import com.corn.cornpos.util.NavigationScreen
import com.corn.cornpos.util.UiEvent
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Delay
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OrderDetailsViewModel @Inject constructor(
    private val repository: CornPosRepository,
    val dataBaseRepository: CornDataBaseRepository,
    @ApplicationContext application: Context
) : ViewModel() {
    val dataStore = CornPosDataStore(application)

    var _order = dataBaseRepository.getAllOrder()
    var orderList by mutableStateOf<List<OrderDetails>>(emptyList())

    private val _tableFloor = dataStore.getCoverTableFloor
    var tableFloor by mutableStateOf("")
    private val _tableId = dataStore.getSelectedTable
    var tableId by mutableStateOf("")
    private val _tablename = dataStore.getSelectedTableName
    var tableName by mutableStateOf("")
    private val _tableCover = dataStore.getCoverTable
    var tableCover by mutableStateOf("")
    private val _customerID = dataStore.getCustomerID
    var customerID by mutableStateOf(0)
    private val _serviceTypeID = dataStore.getServiceTypeID
    var serviceTypeID by mutableStateOf(0)
    private val _customerName = dataStore.getCustomerName
    var customerName by mutableStateOf("")
    private val _editMode = dataStore.isEditMode
    var editMode by mutableStateOf(false)
    var isOrderPlaced by mutableStateOf(false)

    var _deals = dataBaseRepository.getAllDeals()
    var dealsList by mutableStateOf<List<Deals>>(emptyList())
    private val _clientConnString = dataStore.getClientConnString
    var clientConnString by mutableStateOf("")

    val _userInfoDatabaseData = dataBaseRepository.getAllUserInfo()
    var userInfoDatabaseData by mutableStateOf<UserInfoModel?>(null)
    val _loginData = dataBaseRepository.getAllLoginData()
    var loginDatabaseData by mutableStateOf<LoginModel?>(null)
    private val _orderNumber = dataStore.getOrderNumber
    var orderNumber by mutableStateOf(0)
    var fakeOrderNumber by mutableStateOf(orderNumber)
    var orderItemsList = mutableListOf<Any>()
    var finalOrderItemsList = mutableListOf<DealAndItems>()
    var dealOrderList = mutableListOf<Deal>()
    private val _orderDate = dataStore.getOrderDate
    var orderDate by mutableStateOf("")

    val _canDineIn = dataStore.getCanDineIn
    var canDineIn by mutableStateOf(false)
    val _canDelivery = dataStore.getCanDelivery
    var canDelivery by mutableStateOf(false)
    val _canTakeAway = dataStore.getCanTakeAway
    var canTakeAway by mutableStateOf(false)


    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()


    init {


        viewModelScope.launch {
            try {
                _order.collect {
                    orderList = it
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }


        viewModelScope.launch {
            try {
                _loginData.collect {
                    loginDatabaseData = it
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        viewModelScope.launch {
            try {
                _customerID.collect {
                    if (it != null) {
                        customerID = it
                    }
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        viewModelScope.launch {
            try {
                _serviceTypeID.collect {
                    if (it != null) {
                        serviceTypeID = it
                    }
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        viewModelScope.launch {
            try {
                _customerName.collect {
                    if (it != null) {
                        customerName = it
                    }
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        viewModelScope.launch {
            try {
                _editMode.collect {
                    if (it != null) {
                        editMode = it
                    }
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
                _userInfoDatabaseData.collect {
                    userInfoDatabaseData = it
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }


        viewModelScope.launch {
            _orderNumber.collect {
                if (it != null) {
                    orderNumber = it
                    fakeOrderNumber = it
                }
            }

        }





        viewModelScope.launch {
            try {
                _tableId.collect {
                    if (it != null) {
                        tableId = it.toString()
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }

        viewModelScope.launch {
            try {
                _tablename.collect {
                    if (it != null) {
                        tableName = it
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
        viewModelScope.launch {
            try {
                _tableCover.collect {
                    if (it != null) {
                        tableCover = it.toString()
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }

        viewModelScope.launch {
            try {
                _tableFloor.collect {
                    if (it != null) {
                        tableFloor = it.toString()
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }

        viewModelScope.launch {
            try {
                _orderDate.collect {
                    if (it != null) {
                        orderDate = it.toString()
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }



        viewModelScope.launch {

            _canDineIn.collect {
                if (it != null) {
                    canDineIn = it
                }
            }
        }

        viewModelScope.launch {
            _canTakeAway.collect {
                if (it != null) {
                    canTakeAway = it
                }
            }
        }

        viewModelScope.launch {
            _canDelivery.collect {
                if (it != null) {
                    canDelivery = it
                }
            }
        }


        viewModelScope.launch {
            _deals.collect{list->
                dealsList = list
            }

        }


    }


    fun onEvent(event: OrderEvents) {
        when (event) {
            is OrderEvents.OnIncreaseItem -> {
                viewModelScope.launch {
                    dataBaseRepository.insertOrder(
                        OrderDetails(
                            orderNumber = event.item.orderNumber,
                            itemName = event.item.itemName,
                            itemId = event.item.itemId,
                            quantity = event.item.quantity,
                            price = event.item.price,
                            sectionName = event.item.sectionName,
                            isDeal = event.item.isDeal,
                            parentRowId = event.item.parentRowId,
                            parentDeal = event.item.parentDeal

                        )
                    )
                }
            }

            is OrderEvents.OnDecreaseItem -> {

                viewModelScope.launch {
                    dataBaseRepository.insertOrder(
                        OrderDetails(
                            orderNumber = event.item.orderNumber,
                            itemName = event.item.itemName,
                            itemId = event.item.itemId,
                            quantity = event.item.quantity,
                            price = event.item.price,
                            sectionName = event.item.sectionName,
                            parentRowId = event.item.parentRowId,
                            isDeal = event.item.isDeal,
                            parentDeal = event.item.parentDeal,
                            adsOnCategory = event.item.adsOnCategory
                        )
                    )
                }

            }

            is OrderEvents.OnDelete -> {
                viewModelScope.launch {
                    dataBaseRepository.deleteOrder(event.item)

                }
            }

            is OrderEvents.OnPLaceOrder -> {
                isOrderPlaced = true
                orderList.forEach {
                    val gst = it.price * 0.16
                    if (it.adsOnCategory == "Deal parent"){
                      val dealItems = mutableListOf<DealItem>()

                          orderList.forEach {deal->
                          if (deal.parentDeal == it.itemName){
                              dealItems.add(
                                  DealItem(
                                      ID = deal.itemId,
                                      Name = deal.itemName,
                                      IsUnGroup = false,
                                      SectionName = deal.sectionName,
                                      ModifierParentRowID = deal.parentRowId ,
                                      ItemWiseGST= 0,
                                      OrderNotes = "",
                                      Price = deal.price,
                                      IsVoid =  0,
                                  )
                              )
                          }
                      }

                           orderItemsList.add(
                            Deal(
                                DealID = it.itemId,
                                DealName = it.itemName,
                                DealQty= it.quantity,
                                Price = it.price,
                                IsUnGroup = true,
                                ModifierParentRowID = it.parentRowId,
                                IsVoid = 0,
                                ProductCategoryID = null,
                                SaleMUnitCode = null,
                                IsFree = null,
                                OriginalQty = null,
                                GSTPer = null,
                                VoidBy = null,
                                IsModifiedItem = null,
                                KDSQty = null,
                                Items =dealItems,
                            )
                           )
                    }else if (it.adsOnCategory != "deal" && it.parentDeal == null ) {
                        orderItemsList.add(
                                OrderItems(
                                    ID = it.itemId,
                                    Name = it.itemName,
                                    Qty = it.quantity,
                                    Price = it.price,
                                    ItemWiseGST = gst.toInt(),
                                    Discount = 0,
                                    IsUnGroup = false,
                                    IsVoid = 0,
                                    IsDeal = it.isDeal,
                                    ModifierParentRowID = it.parentRowId,
                                    SectionName = it.sectionName
                                )

                        )
                    }
                }

                viewModelScope.launch {

                    try {
                        delay(3000)
                        val res = repository.saveOrder(
                            xConn = clientConnString,
                            authorization = "${loginDatabaseData?.Token_Type} ${loginDatabaseData?.Access_Token}",
                            payload = Payload(
                                SpName = "uspInsertDataOfflineMode",
                                Parameters = OrderParameters(
                                    JsonString = JsonString(
                                        Orders = listOf(
                                            Order(
                                                OrderID = "temp#${fakeOrderNumber}",
                                                ServiceTypeID = serviceTypeID,
                                                PaymentMode = 0,
                                                TableID = tableId.toInt(),
                                                GrossAmount = event.grossAmount,
                                                IsHold = 1,
                                                CoverTable = tableCover.toInt(),
                                                CustomerID = customerID,
                                                ManualOrderNo = null,
                                                Remarks = "",
                                                GSTAmount = event.GSTAmount,
                                                DeliveryChannel = 1,
                                                Items = orderItemsList,
                                                ItemWiseDiscount = 0,
                                                UserID = userInfoDatabaseData?.UserId!!,
                                                GSTPer = 16,
                                                OrderTakeId = fakeOrderNumber,
                                                ServiceCharges = 0,
                                                ServiceChargesType = 0,
                                                Discount = 0,
                                                DiscountType = 0,
                                                BankID = 0,
                                                PaymentReceived = 0,
                                                Cancelled = 0,
                                                CashImpact = 0,
                                                ItemLog = emptyList(),
                                                TakeawayCustomerName = customerName

                                            )
                                        )
                                    ),
                                    DistributorID = userInfoDatabaseData?.DistributionID.toString()
                                )
                            )
                        )


                        val body = res.body()
                        if (res.isSuccessful) {
                            if (body?.Status == true) {
                                dataStore.saveEditMode(false)
                                dataStore.savedCustomerName("Walking Customer")
                                dataStore.savedCustomerID(0)
                                dataStore.savedCoverTableFloor("")
                                dataStore.savedOrderDate("")
                                dataStore.savedCoverTable(0)
                                dataStore.savedOrderNumber(0)
                                dataStore.saveServiceTypeID(0)
                                dataStore.savedSelectedTable(0)
                                dataStore.savedParentRowID(0)
                                dataStore.savedSelectedTableName("")
                                dataBaseRepository.deleteAllOrder()
                                sentUiEvent(
                                    UiEvent.ShowSnackBar(
                                        message = "Order Successfully Placed"
                                    )
                                )
                                isOrderPlaced = false
                                sentUiEvent(UiEvent.Navigate(NavigationScreen.DashboardScreen.route))
                            }
                        }

                    }catch (e:Exception){
                        print(e.message)
                    }

                    isOrderPlaced = false

                    delay(40000)
                    orderItemsList.clear()
                }

            }

            is OrderEvents.OnCancelOrderClick -> {

                viewModelScope.launch {
                    dataStore.savedSelectedTableName("")
                }
                viewModelScope.launch {
                    dataStore.savedCoverTable(0)
                }
                viewModelScope.launch {
                    dataStore.saveServiceTypeID(0)
                }

                viewModelScope.launch {
                    dataStore.savedCustomerName("Walking Customer")
                    dataStore.savedCustomerID(0)
                }

                viewModelScope.launch {
                    dataStore.saveEditMode(false)
                    dataStore.savedOrderNumber(0)
                }



                viewModelScope.launch {
                    dataStore.savedCoverTableFloor("")
                    dataStore.savedOrderDate("")
                }
                viewModelScope.launch {
                    dataStore.savedParentRowID(0)
                }


                viewModelScope.launch {
                    dataStore.savedSelectedTable(0)
                }

                val message = if (editMode) "Cart Successfully Cleared" else "Order Successfully Canceled"
                viewModelScope.launch {
                    dataBaseRepository.deleteAllOrder()
                    sentUiEvent(
                        UiEvent.ShowSnackBar(
                            message = message
                        )
                    )

                }

            }

            is OrderEvents.OnUpdateOrder -> {
                isOrderPlaced = true
                orderList.forEach {
                    val gst = it.price * 0.16
                    if (it.adsOnCategory == "Deal parent"){
                        val dealItems = mutableListOf<DealItem>()

                        orderList.forEach {deal->
                            if (deal.parentDeal == it.itemName){
                                dealItems.add(
                                    DealItem(
                                        ID = deal.itemId,
                                        Name = deal.itemName,
                                        IsUnGroup = false,
                                        SectionName = deal.sectionName,
                                        ModifierParentRowID = deal.parentRowId ,
                                        ItemWiseGST= 0,
                                        OrderNotes = "",
                                        IsVoid =  0,
                                    )
                                )
                            }
                        }

                        orderItemsList.add(
                            Deal(
                                DealID = it.itemId,
                                DealName = it.itemName,
                                DealQty= it.quantity,
                                Price = it.price,
                                IsUnGroup = true,
                                ModifierParentRowID = it.parentRowId,
                                IsVoid = 0,
                                ProductCategoryID = null,
                                SaleMUnitCode = null,
                                IsFree = null,
                                OriginalQty = null,
                                GSTPer = null,
                                VoidBy = null,
                                IsModifiedItem = null,
                                KDSQty = null,
                                Items =dealItems,
                            )
                        )
                    }else if (it.adsOnCategory != "deal") {
                        orderItemsList.add(
                            OrderItems(
                                ID = it.itemId,
                                Name = it.itemName,
                                Qty = it.quantity,
                                Price = it.price,
                                ItemWiseGST = gst.toInt(),
                                Discount = 0,
                                IsUnGroup = false,
                                IsVoid = 0,
                                IsDeal = it.isDeal,
                                ModifierParentRowID = it.parentRowId,
                                SectionName = it.sectionName
                            )

                        )
                    }
                }

                viewModelScope.launch {
                    try {
                        delay(3000)
                        val res = repository.updateOrder(
                            xConn = clientConnString,
                            authorization = "${loginDatabaseData?.Token_Type} ${loginDatabaseData?.Access_Token}",
                            payload = Payload(
                                SpName = "uspInsertDataOfflineMode",
                                Parameters = OrderParameters(
                                    JsonString = JsonString(
                                        Orders = listOf(
                                            Order(
                                                OrderID = "${fakeOrderNumber}",
                                                ServiceTypeID = serviceTypeID,
                                                PaymentMode = 0,
                                                TableID = tableId.toInt(),
                                                GrossAmount = event.grossAmount,
                                                IsHold = 1,
                                                CoverTable = tableCover.toInt(),
                                                CustomerID = customerID,
                                                ManualOrderNo = null,
                                                Remarks = "",
                                                GSTAmount = event.GSTAmount,
                                                DeliveryChannel = 1,
                                                Items = orderItemsList,
                                                ItemWiseDiscount = 0,
                                                UserID = userInfoDatabaseData?.UserId!!,
                                                GSTPer = 16,
                                                OrderTakeId = fakeOrderNumber,
                                                ServiceCharges = 0,
                                                ServiceChargesType = 0,
                                                Discount = 0,
                                                DiscountType = 0,
                                                BankID = 0,
                                                PaymentReceived = 0,
                                                Cancelled = 0,
                                                CashImpact = 0,
                                                ItemLog = emptyList(),
                                                TakeawayCustomerName = customerName

                                            )
                                        )
                                    ),
                                    DistributorID = userInfoDatabaseData?.DistributionID.toString()
                                )
                            )
                        )


                        val body = res.body()
                        if (res.isSuccessful) {
                            if (body?.Status == true) {
                                dataStore.saveEditMode(false)
                                dataStore.savedCustomerName("Walking Customer")
                                dataStore.savedCustomerID(0)
                                dataStore.savedCoverTableFloor("")
                                dataStore.savedOrderDate("")
                                dataStore.savedCoverTable(0)
                                dataStore.savedOrderNumber(0)
                                dataStore.saveServiceTypeID(0)
                                dataStore.savedParentRowID(0)
                                dataStore.savedSelectedTable(0)
                                dataStore.savedSelectedTableName("")
                                dataBaseRepository.deleteAllOrder()
                                sentUiEvent(
                                    UiEvent.ShowSnackBar(
                                        message = "Order Successfully Udate"
                                    )
                                )
                                sentUiEvent(UiEvent.Navigate(NavigationScreen.DashboardScreen.route))
                            isOrderPlaced = false
                            }
                        }

                    }catch (e:Exception){
                        print(e.message)
                    }

                    delay(40000)
                    orderItemsList.clear()
                }
            }

        }

    }


    private fun sentUiEvent(event: UiEvent) {
        viewModelScope.launch {
            _uiEvent.send(event)
        }
    }


    fun getTableDetailsFromJson(jsonString: String): String {
        var table = ""
        val gson = GsonBuilder()
            .registerTypeAdapter(
                TableDetailsDto::class.java,
                DashboardViewModel.TableDetailsDtoDeserializer()
            )
            .create()
        val typeToken = object : TypeToken<Array<TableDetailsDto>>() {}.type
        val orders = gson.fromJson<Array<TableDetailsDto>>(jsonString, typeToken)

        for (order in orders) {
            println("OrderID: ${order.orderID}, TableID: ${order.tableID}, TableName: ${order.tableName}")
            table = order.tableName
        }

        return table
    }

}