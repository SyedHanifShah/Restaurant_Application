package com.corn.cornpos.ui.screen.menu

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
import com.corn.cornpos.data.database.AdsOn
import com.corn.cornpos.data.database.Category
import com.corn.cornpos.data.database.Deals
import com.corn.cornpos.data.database.OrderDetails
import com.corn.cornpos.data.database.Products
import com.corn.cornpos.repository.CornDataBaseRepository
import com.corn.cornpos.repository.CornPosRepository
import com.corn.cornpos.ui.screen.dashboard.getCurrentDateFormat
import com.corn.cornpos.util.DealManager
import com.corn.cornpos.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import org.json.JSONArray
import javax.inject.Inject


@HiltViewModel
class MenuViewModel @Inject constructor(
    private val repository: CornPosRepository,
    private val dataBaseRepository: CornDataBaseRepository,
    @ApplicationContext application: Context

) : ViewModel() {

     val dataStore = CornPosDataStore(application)
    val selectedItems = mutableStateListOf<AdsOn>()
    val selectedDealItems = mutableStateListOf<Products>()
    var dealManager = mutableStateListOf<DealManager>()
    val selectedCategoryrestriction = mutableStateOf(1)
    var aDealAllItems =  mutableStateListOf<Any>()

    val DealSelectedItem = mutableStateListOf<Products>()

    val _Category = dataBaseRepository.getAllCategoryData()
    var categoryDatabaseData by mutableStateOf<List<Category>>(emptyList())

    val _AdsOnList = dataBaseRepository.getAllAdsOnData()
    var adsOnList by mutableStateOf<List<AdsOn>>(emptyList())

    var _productsDatabaseData = dataBaseRepository.getAllProductData()
    var productsDatabaseData by mutableStateOf<List<Products>>(emptyList())

    var _deals = dataBaseRepository.getAllDeals()
    var dealsList by mutableStateOf<List<Deals>>(emptyList())
     var _order = dataBaseRepository.getAllOrder()
    var orderList by mutableStateOf<List<OrderDetails>>(emptyList())


    private val _tableFloor = dataStore.getCoverTableFloor
    var tableFloor by mutableStateOf("")

    private val _tableId = dataStore.getSelectedTable
    var tableId by mutableStateOf("")
    private val _tableName = dataStore.getSelectedTableName
    var tableName by mutableStateOf("")

    private val _parentRowId = dataStore.getItemParentRowID
    var parentRowId by mutableStateOf(0)

    private val _tableCover = dataStore.getCoverTable
    var tableCover by mutableStateOf("")

    private val _can_dineIn = dataStore.getCanDineIn
    var canDinein by mutableStateOf(false)
    private val _can_takeAway= dataStore.getTakeAwayTittle
    var canTakwAway by mutableStateOf("")
    private val _edit_mode = dataStore.isEditMode
    var editMode by mutableStateOf(false)

    private val _orderNumber = dataStore.getOrderNumber
    var orderNumber by mutableStateOf(0)

    private val _customerName = dataStore.getCustomerName
    var customerName by mutableStateOf("")
    var fakeOrderNumber by mutableStateOf(orderNumber)
    val dealsProducts = mutableStateListOf<Products>()
    var dealsProductsIdList = mutableStateListOf<Int>()
    var dealsProductsIdList2 by mutableStateOf<List<Int>>(emptyList())



    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()


    init {

        viewModelScope.launch {
            try {
                _Category.collect{
                    categoryDatabaseData = it
                }

            }catch (e:Exception){
                e.printStackTrace()
            }
        }

        viewModelScope.launch {
            try {
                _AdsOnList.collect{
                    adsOnList = it
                }

            }catch (e:Exception){
                e.printStackTrace()
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
                _tableName.collect {
                    if (it != null) {
                        tableName = it.toString()
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }

        viewModelScope.launch {
            try {
                _parentRowId.collect {
                    if (it != null) {
                        parentRowId = it
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
                _can_dineIn.collect {
                    if (it != null) {
                        canDinein = it
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }


        viewModelScope.launch {
            try {
                _can_takeAway.collect {
                    if (it != null) {
                        canTakwAway = it
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }


        viewModelScope.launch {
            try {
                _edit_mode.collect {
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
                _customerName.collect {
                    if (it != null) {
                        customerName = it.toString()
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
            _deals.collect{list->
                dealsList = list
               list.forEach {
                   if (it.DealItems != null){
                       dealsProductsIdList2 = getDealId(it.DealItems)
                       dealsProductsIdList2.forEach {it2->
                           dealsProductsIdList.add(it2)
                       }
                   }
               }

            }

        }


        viewModelScope.launch {
            _productsDatabaseData.collect { products ->
                productsDatabaseData = products

                val uniqueDealsProductsIdSet = HashSet<String>()
                val uniqueDealsProducts = mutableListOf<Products>()

                dealsProductsIdList.forEach { dealsID ->
                    val product = productsDatabaseData.singleOrNull { it.ItemID == dealsID }
                    if (product != null && uniqueDealsProductsIdSet.add(dealsID.toString())) {
                        uniqueDealsProducts.add(product)
                    }
                }

                dealsProducts.clear()
                dealsProducts.addAll(uniqueDealsProducts)
            }
        }









        viewModelScope.launch {
            _orderNumber.collect{
                if (it != null) {
                    orderNumber = it
                    fakeOrderNumber = it
                }
            }

        }



    }




    fun onEvent(event: MenuEvents){
        when(event){


            is MenuEvents.OnItemClick->{
                val currentTimeInMillis = System.currentTimeMillis()
                val lastFourDigits = currentTimeInMillis % 10000

                viewModelScope.launch {
                    if (!editMode){
                        if (orderList.isEmpty()){
                            dataStore.savedOrderDate(getCurrentDateFormat())
                        }
                    }
                }

                var alreadyAddItem :OrderDetails? = null
                if (orderList.isNotEmpty()){
                  alreadyAddItem =   orderList.firstOrNull() { (it.itemName == event.name) && (it.adsOnCategory == event.adsOnCategory) }

                }


                viewModelScope.launch {
                    if (orderNumber == 0){
                        fakeOrderNumber++
                        dataStore.savedOrderNumber(lastFourDigits.toInt())
                    }
                }
                viewModelScope.launch {
                    dataStore.savedParentRowID(parentRowId + 1)
                }

                if (alreadyAddItem == null){

                    viewModelScope.launch {
                        dataBaseRepository.insertOrder(
                            OrderDetails(
                                itemName = event.name,
                                quantity = event.quantity,
                                itemId = event.ItemId,
                                price = event.price.toInt(),
                                sectionName = event.sectionName,
                                parentRowId = event.parentRowId,
                                adsOnCategory = event.adsOnCategory,
                                isDeal = event.isDeal,
                                parentDeal = event.parentDeal,
                                intDealID = event.intDealId
                            )
                        )
                    }

                }else {
                    viewModelScope.launch {
                        dataBaseRepository.insertOrder(
                            OrderDetails(
                                orderNumber = alreadyAddItem.orderNumber,
                                itemName = event.name,
                                quantity = alreadyAddItem.quantity + 1,
                                itemId = event.ItemId,
                                price = event.price.toInt(),
                                sectionName = event.sectionName,
                                parentRowId = event.parentRowId,
                                adsOnCategory = event.adsOnCategory,
                                isDeal = event.isDeal,
                                parentDeal = event.parentDeal
                            )
                        )
                    }
                }
            }
        }

    }








    fun getProductsByID(categoryId: String, callBack:(List<Products>)-> Unit ){
      val list =  productsDatabaseData.filter { item->
            item.CategoryID.toString() == categoryId

        }

        callBack(list)
    }



    fun getDealId(jsonString: String): List<Int> {
        var list = mutableListOf<Int>()
        if (jsonString.isNotEmpty()){
            val jsonArray = JSONArray(jsonString)
            for (i in 0 until jsonArray.length()) {
                val jsonObject = jsonArray.getJSONObject(i)
                val dealId = jsonObject.getInt("ItemID")
                list.add(dealId)
            }

        }

        return list

    }




    fun clearDealsSelectedItems() {
        DealSelectedItem.clear()
    }


    }