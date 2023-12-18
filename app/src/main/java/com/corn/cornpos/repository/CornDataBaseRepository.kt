package com.corn.cornpos.repository

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.corn.cornpos.data.database.AdsOn
import com.corn.cornpos.data.database.Category
import com.corn.cornpos.data.database.Customer
import com.corn.cornpos.data.database.Deals
import com.corn.cornpos.data.database.LoginModel
import com.corn.cornpos.data.database.OrderDetails
import com.corn.cornpos.data.database.Products
import com.corn.cornpos.data.database.Table
import com.corn.cornpos.data.database.UserInfoModel
import kotlinx.coroutines.flow.Flow

interface CornDataBaseRepository {

    suspend fun insertLoginData(loginModel: LoginModel)
    suspend fun deleteLoginData(loginModel: LoginModel)
    suspend fun getLoginDataById(id: String): LoginModel?
    fun getAllLoginData(): Flow<LoginModel>
    suspend fun insertUserInfo(userInfoModel: UserInfoModel)
    suspend fun deleteUserInfo(userInfoModel: UserInfoModel)
    suspend fun getUserInfoById(id: String): UserInfoModel?
    fun getAllUserInfo(): Flow<UserInfoModel>

    suspend fun insertProduct(products: Products)
    suspend fun deleteProduct(products: Products)
    fun getProductId(id: String): Flow<List<Products>>
    fun getAllProductData(): Flow<List<Products>>
    suspend fun deleteAllProductData()


    suspend fun insertCategory(category: Category)
    suspend fun deleteCategory(category: Category)
    suspend fun getCategoryId(id: String): Category?
    fun getAllCategoryData(): Flow<List<Category>>
    suspend fun deleteAllCategoryData()




    suspend fun insertDeals(deals: Deals)
    suspend fun deleteDeals(deals: Deals)
    suspend fun getDealsBYId(id: String): Deals?
    fun getAllDeals(): Flow<List<Deals>>
    suspend fun deleteAllDeals()




    suspend fun insertTable(table: Table)
    suspend fun deleteTable(table: Table)
    fun getTableId(id: String): Flow<List<Table>>
    fun getAllTableData(): Flow<List<Table>>
    suspend fun deleteAllTableData()


    suspend fun insertCustomer(customer: Customer)
    suspend fun deleteCustomer(customer: Customer)
    suspend fun getCustomerBYId(id: String): Customer?
    fun getAllCustomer(): Flow<List<Customer>>
    suspend fun deleteAllCustomer()



    suspend fun insertAdsOn(adsOn: AdsOn)
    suspend fun deleteAdsOn(adsOn: AdsOn)
    fun getAdsOnByItemId(id: String): Flow<List<AdsOn>>
    fun getAllAdsOnData(): Flow<List<AdsOn>>
    suspend fun deleteAllAdsOnData()



    suspend fun insertOrder(orderDetails: OrderDetails)
    suspend fun insertOrderList(orderDetails: List<OrderDetails>)
    suspend fun deleteOrder(orderDetails: OrderDetails)

    fun getOrderByItemId(id: String): Flow<List<OrderDetails>>
    fun getAllOrder(): Flow<List<OrderDetails>>
    suspend fun deleteAllOrder()

}