package com.corn.cornpos.ui.screen.login

import android.content.Context
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.corn.cornpos.data.CornPosDataStore
import com.corn.cornpos.data.database.AdsOn
import com.corn.cornpos.data.database.Category
import com.corn.cornpos.data.database.Customer
import com.corn.cornpos.data.database.Deals
import com.corn.cornpos.data.database.LoginModel
import com.corn.cornpos.data.database.Products
import com.corn.cornpos.data.database.Table
import com.corn.cornpos.data.database.UserInfoModel
import com.corn.cornpos.data.remote.dto.DashboardPayload
import com.corn.cornpos.data.remote.dto.LoginDto
import com.corn.cornpos.data.remote.dto.LoginPayload
import com.corn.cornpos.data.remote.dto.MasterRow
import com.corn.cornpos.data.remote.dto.Parameters
import com.corn.cornpos.data.remote.dto.UerInfo
import com.corn.cornpos.repository.CornDataBaseRepository
import com.corn.cornpos.repository.CornPosRepository
import com.corn.cornpos.util.NavigationScreen
import com.corn.cornpos.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.async
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class LoginViewModel @Inject constructor(
    private val repository: CornPosRepository,
    private val dataBaseRepository: CornDataBaseRepository,
    @ApplicationContext application: Context
) : ViewModel() {


    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    var password by mutableStateOf("")
    var userName by mutableStateOf("")
    private val dataStore = CornPosDataStore(application)
    private val _clientConnString = dataStore.getClientConnString
    var clientConnString by mutableStateOf("")
    private val _firstLogin = dataStore.isFirstLogin
    var isFirstLogin by mutableStateOf(false)

    private val _saveduserName = dataStore.getUserName
    var savedUserName by mutableStateOf("")
    private val _savedPassword = dataStore.getPassword
    var savedPassword by mutableStateOf("")
    var userData by mutableStateOf<UerInfo?>(null)

    var circleProgress by mutableStateOf(false)
    var getMatserData by mutableStateOf(false)
    val data = mutableStateOf<LoginDto?>(null)




    init {

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
                _firstLogin.collect {
                    if (it != null) {
                        isFirstLogin = it
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }

        viewModelScope.launch {
            try {
                _savedPassword.collect {
                    if (it != null) {
                        savedPassword = it
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }

        viewModelScope.launch {
            try {
                _saveduserName.collect {
                    if (it != null) {
                        savedUserName = it
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }


    }


    fun onEvent(event: LoginEvents) {
        when (event) {
            is LoginEvents.OnUserNameChange -> {
                userName = event.userName
            }

            is LoginEvents.OnPasswordChange -> {
                password = event.password
            }

            is LoginEvents.OnLoginClick -> {
                viewModelScope.launch {
                    // Call the first API
                    val result1 = async { callApi1() }.await()

                    // Call the second API only if the first API call is successful
                    if (result1) {

                        val result2 = async { callApi2() }.await()
                        if (result2) {
                            sentUiEvent(UiEvent.Navigate(NavigationScreen.DashboardScreen.route))

                        }
                    }
                }
            }

            is LoginEvents.OnFingerPrentClick -> {

            }

            is LoginEvents.OnForgotPasswordClick -> {
                sentUiEvent(UiEvent.Navigate(NavigationScreen.ForgotPassword.route))
            }
        }

    }

    private fun sentUiEvent(event: UiEvent) {
        viewModelScope.launch {
            _uiEvent.send(event)
        }
    }

    fun insertLoginDataToDataBase(body: LoginDto) {
        viewModelScope.launch {
            dataBaseRepository.insertLoginData(
                LoginModel(
                    id = 1,
                    Access_Token = body.Access_Token,
                    Expires = body.Expires,
                    Expires_In = body.Expires_In,
                    Issued = body.Issued,
                    Token_Type = body.Token_Type,
                    Status = body.Status
                )
            )
        }
    }

    fun insertUserInfoDataToDataBase(body: LoginDto) {
        viewModelScope.launch {
            val userInfo = body.UerInfo
            userData = userInfo
            dataBaseRepository.insertUserInfo(
                UserInfoModel(
                    id = 1,
                    Can_Delivery = userInfo.Can_Delivery,
                    Can_DineIn = userInfo.Can_DineIn,
                    Can_TakeAway = userInfo.Can_TakeAway,
                    DealColumn = userInfo.DealColumn,
                    DefaultServiceType = userInfo.DefaultServiceType,
                    DistributionID = userInfo.DistributionID,
                    DistributionName = userInfo.DistributionName,
                    DistributorName = userInfo.DistributorName,
                    DefaultServiceTypeID = userInfo.DefaultServiceTypeID,
                    DistributorTypeID = userInfo.DistributorTypeID,
                    IsEncrypted = userInfo.IsEncrypted,
                    IsDistributorRegister = userInfo.IsDistributorRegister,
                    IS_CanGiveDiscount = userInfo.IS_CanGiveDiscount,
                    OTPicturesManadatory = userInfo.OTPicturesManadatory,
                    RoleID = userInfo.RoleID,
                    UserId = userInfo.UserId,
                    UserName = userInfo.UserName,
                    WorkingDate = userInfo.WorkingDate,
                    EncryptKey = userInfo.EncryptKey

                )
            )
        }
    }


    suspend fun callApi1(): Boolean {
        try {
            if (password.isNotBlank() && userName.isNotBlank()) {
                circleProgress = true
                val res = repository.login(
                    xConn = clientConnString, payload = LoginPayload(
                        userName = userName,
                        password = password,
                        grant_type = "password"
                    )
                )
                dataStore.savedPassword(password)
                dataStore.savedUserName(userName)
                val body = res.body()
                if (res.isSuccessful) {
                    if (body?.Status == true) {
                            insertLoginDataToDataBase(body)
                            insertUserInfoDataToDataBase(body)
                            data.value = body
                            getMatserData = true

                    } else {
                        circleProgress = false
                        sentUiEvent(
                            UiEvent.ShowSnackBar(
                                message = "Incorrect credentials"
                            )
                        )
                    }
                } else {
                    circleProgress = false
                    getMatserData = true
                    sentUiEvent(
                        UiEvent.ShowSnackBar(
                            message = "Incorrect credentials"
                        )
                    )
                }


            } else {
                getMatserData = true
                sentUiEvent(
                    UiEvent.ShowSnackBar(
                        message = "Username and Password not be empty."
                    )
                )
            }

        } catch (e: Exception) {
            e.printStackTrace()
            getMatserData = true
        }
        return getMatserData
    }


    suspend fun callApi2(): Boolean {
        var result = false
        try {
            val res = repository.masterData(
                xConn = clientConnString,
                authorization = "${data.value?.Token_Type} ${data.value?.Access_Token}",
                payload = DashboardPayload(
                    SpName = "uspGetAllMasterDataApi",
                    Parameters = Parameters(DistributorID = data.value?.UerInfo?.DistributionID.toString())
                )
            )


            if (res.isSuccessful) {
                val body = res.body()
                if (body?.Status == true) {
                    viewModelScope.launch {
                        dataBaseRepository.deleteAllProductData()
                        dataBaseRepository.deleteAllDeals()
                        dataBaseRepository.deleteAllCustomer()
                        dataBaseRepository.deleteAllCategoryData()
                        dataBaseRepository.deleteAllAdsOnData()
                        dataBaseRepository.deleteAllTableData()

                        dataStore.saveIsFirstLogin(true)
                        dataBaseRepository.deleteAllOrder()
                        dataStore.savedCustomerName("Walking Customer")
                        dataStore.savedCustomerID(0)
                        dataStore.savedOrderDate("")
                        dataStore.savedCoverTableFloor("")
                        dataStore.savedCoverTable(0)
                        dataStore.savedSelectedTable(0)
                        dataStore.savedSelectedTableName("")
                    }

                    delay(2000)
                    for(it in body.Rows[5]) {


                        val imagePath = it.ImagePath ?: ""
                        dataBaseRepository.insertCategory(
                            Category(
                                CategoryID = it.CategoryID,
                                Category = it.Category,
                                ImagePath = imagePath,
                                ParentCategoryID = it.ParentCategoryID,
                                ProductCount = it.ProductCount
                            )
                        )
                    }


                    body.Rows[6].forEach {
                        val imagePath = it.ImagePath ?: ""
                        dataBaseRepository.insertProduct(
                            Products(
                                ItemID = it.ItemID,
                                CategoryID = it.CategoryID,
                                DiscountPer = it.DiscountPer.toInt(),
                                DiscountPrice = it.DiscountPrice,
                                Favourite = it.Favourite,
                                ImagePath = imagePath,
                                IsAddsOn = it.IsAddsOn,
                                IsDeal = it.IsDeal,
                                IsHasAddsOn = it.IsHasAddsOn,
                                IsUnGroup = it.IsUnGroup,
                                ItemCode = it.ItemCode,
                                ItemName = it.ItemName,
                                Price = it.Price,
                                Rating = it.Rating,
                                SectionName = it.SectionName,
                                SectionID = it.SectionID
                            )
                        )
                    }

                    body.Rows[7].forEach {
                        dataBaseRepository.insertAdsOn(

                            AdsOn(
                                AdsOnCategoryID = it.AdsOnCategoryID,
                                AdsOnCategoryName = it.AdsOnCategoryName,
                                AdsOnID = it.AdsOnID,
                                AdsOnName = it.AdsOnName,
                                ItemName = it.ItemName,
                                ItemID = it.ItemID,
                                IsMultiSelectModifier = it.IsMultiSelectModifier,
                                Price = it.Price
                            )
                        )
                    }

                    body.Rows[8].forEach {

                        val dealsItems = if (it.DealItems != null) it.DealItems else ""

                        dataBaseRepository.insertDeals(
                            Deals(
                                CategoryID = it.CategoryID,
                                CategoryName = it.CategoryName,
                                DealID = it.DealID,
                                DealItemQuantity = it.DealItemQuantity,
                                DealItems = dealsItems,
                                DealName = it.DealName,
                                DealPrice = it.DealPrice,
                                intDealID = it.intDealID
                            )
                        )
                    }
                    body.Rows[1].forEach {
                        dataBaseRepository.insertTable(
                            Table(
                                BookingFrom = "bookingFrom",
                                BookingTo = "bookingTo",
                                CustomerID = it.CustomerID,
                                FloorID = it.FloorID,
                                FloorName = it.FloorName,
                                TableID = it.TableID,
                                TableNo = it.TableNo
                            )
                        )
                    }

                    result = true
                } else {
                    result = false
                    sentUiEvent(
                        UiEvent.ShowSnackBar(
                            message = "Check Internet Connection"
                        )
                    )
                }
            } else {
                result = false
                sentUiEvent(
                    UiEvent.ShowSnackBar(
                        message = "Check Internet Connection"
                    )
                )
            }
        } catch (e: Exception) {
            e.printStackTrace()
            result = false
        }

        return result
    }

    fun loginFromBiometric() {

        viewModelScope.launch {
            // Call the first API
            val result1 = async { callApi3() }.await()

            // Call the second API only if the first API call is successful
            if (result1) {
                val result2 = async { callApi2() }.await()
                if (result2) {
                    circleProgress = false
                    sentUiEvent(UiEvent.Navigate(NavigationScreen.DashboardScreen.route))

                }
            }
        }


    }


    suspend fun callApi3(): Boolean {
        try {
            if (savedPassword.isNotBlank() && savedUserName.isNotBlank()) {
                circleProgress = true
                val res = repository.login(
                    xConn = clientConnString, payload = LoginPayload(
                        userName = savedUserName,
                        password = savedPassword,
                        grant_type = "password"
                    )
                )
                val body = res.body()
                if (res.isSuccessful) {
                    if (body?.Status == true) {
                        insertLoginDataToDataBase(body)
                        insertUserInfoDataToDataBase(body)
                        data.value = body
                        getMatserData = true


                    } else {
                        circleProgress = false
                        sentUiEvent(
                            UiEvent.ShowSnackBar(
                                message = "Incorrect credentials"
                            )
                        )
                    }
                } else {
                    circleProgress = false
                    getMatserData = true
                    sentUiEvent(
                        UiEvent.ShowSnackBar(
                            message = "Incorrect credentials"
                        )
                    )
                }


            } else {
                getMatserData = true
                sentUiEvent(
                    UiEvent.ShowSnackBar(
                        message = "Username and Password not be empty."
                    )
                )
            }

        } catch (e: Exception) {
            e.printStackTrace()
            getMatserData = true
        }
        return getMatserData
    }


}