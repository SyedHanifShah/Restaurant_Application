package com.corn.cornpos.repository

import com.corn.cornpos.data.database.AdsOn
import com.corn.cornpos.data.database.AdsOnDao
import com.corn.cornpos.data.database.Category
import com.corn.cornpos.data.database.CategoryDao
import com.corn.cornpos.data.database.Customer
import com.corn.cornpos.data.database.CustomerDao
import com.corn.cornpos.data.database.Deals
import com.corn.cornpos.data.database.DealsDao
import com.corn.cornpos.data.database.LoginDao
import com.corn.cornpos.data.database.LoginModel
import com.corn.cornpos.data.database.OrderDetails
import com.corn.cornpos.data.database.OrderDetailsDao
import com.corn.cornpos.data.database.Products
import com.corn.cornpos.data.database.ProductsDao
import com.corn.cornpos.data.database.Table
import com.corn.cornpos.data.database.TableDeo
import com.corn.cornpos.data.database.UserInfoDao
import com.corn.cornpos.data.database.UserInfoModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CornPosDataBaseRepositoryImpl @Inject constructor(
    private val userInfoDao: UserInfoDao,
    private val loginDao: LoginDao,
    private val productsDao: ProductsDao,
    private val categoryDao: CategoryDao,
    private val dealsDao: DealsDao,
    private val tableDeo: TableDeo,
    private val customerDao: CustomerDao,
    private val adsOnDao: AdsOnDao,
    private val orderDetailsDao: OrderDetailsDao
):CornDataBaseRepository {
    override suspend fun insertLoginData(loginModel: LoginModel) {
        return loginDao.insertLoginData(loginModel)
    }

    override suspend fun deleteLoginData(loginModel: LoginModel) {
        return loginDao.deleteLoginData(loginModel)
    }

    override suspend fun getLoginDataById(id: String): LoginModel? {
        return loginDao.getLoginDataById(id)
    }

    override fun getAllLoginData(): Flow<LoginModel> {
        return loginDao.getAllLoginData()
    }

    override suspend fun insertUserInfo(userInfoModel: UserInfoModel) {
        return userInfoDao.insertUserInfo(userInfoModel)
    }

    override suspend fun deleteUserInfo(userInfoModel: UserInfoModel) {
        return userInfoDao.deleteUserInfo(userInfoModel)
    }

    override suspend fun getUserInfoById(id: String): UserInfoModel? {
        return userInfoDao.getUserInfoById(id)
    }

    override fun getAllUserInfo(): Flow<UserInfoModel> {
        return userInfoDao.getAllUserInfo()
    }

    override suspend fun insertProduct(products: Products) {
        return productsDao.insertProduct(products)
    }

    override suspend fun deleteProduct(products: Products) {
       return productsDao.deleteProduct(products)
    }

    override fun getProductId(id: String): Flow<List<Products>> {
      return productsDao.getProductId(id)
    }

    override fun getAllProductData(): Flow<List<Products>> {
     return productsDao.getAllProductData()
    }

    override suspend fun deleteAllProductData() {
        productsDao.deleteAllProductData()
    }

    override suspend fun insertCategory(category: Category) {
      return categoryDao.insertCategory(category)
    }

    override suspend fun deleteCategory(category: Category) {
       return categoryDao.deleteCategory(category)
    }

    override suspend fun getCategoryId(id: String): Category? {
        return  categoryDao.getCategoryId(id)
    }

    override fun getAllCategoryData(): Flow<List<Category>> {
       return categoryDao.getAllCategoryData()
    }

    override suspend fun deleteAllCategoryData() {
        categoryDao.deleteAllCategoryData()
    }

    override suspend fun insertDeals(deals: Deals) {
      return dealsDao.insertDeals(deals)
    }

    override suspend fun deleteDeals(deals: Deals) {
        return dealsDao.deleteDeals(deals)
    }

    override suspend fun getDealsBYId(id: String): Deals? {
        return  dealsDao.getDealsBYId(id)
    }

    override fun getAllDeals(): Flow<List<Deals>> {
       return dealsDao.getAllDeals()
    }

    override suspend fun deleteAllDeals() {
        dealsDao.deleteAllDeals()
    }

    override suspend fun insertTable(table: Table) {
       return tableDeo.insertTable(table)
    }

    override suspend fun deleteTable(table: Table) {
    return tableDeo.deleteTable(table)
    }

    override fun getTableId(id: String): Flow<List<Table>> {
        return  tableDeo.getTableId(id)
    }

    override fun getAllTableData(): Flow<List<Table>> {
        return  tableDeo.getAllTableData()
    }

    override suspend fun deleteAllTableData() {
    tableDeo.deleteAllTableData()
    }

    override suspend fun insertCustomer(customer: Customer) {
      return customerDao.insertCustomer(customer)
    }

    override suspend fun deleteCustomer(customer: Customer) {
       return customerDao.deleteCustomer(customer)
    }

    override suspend fun getCustomerBYId(id: String): Customer? {
        return  customerDao.getCustomerBYId(id)
    }

    override fun getAllCustomer(): Flow<List<Customer>> {
       return  customerDao.getAllCustomer()
    }

    override suspend fun deleteAllCustomer() {
        customerDao.deleteAllCustomer()
    }


    override suspend fun insertAdsOn(adsOn: AdsOn) {
        return adsOnDao.insertAdsOn(adsOn)
    }

    override suspend fun deleteAdsOn(adsOn: AdsOn) {
        return adsOnDao.deleteAdsOn(adsOn)
    }

    override fun getAdsOnByItemId(id: String): Flow<List<AdsOn>> {
        return  adsOnDao.getAdsOnByItemId(id)
    }

    override fun getAllAdsOnData(): Flow<List<AdsOn>> {
       return  adsOnDao.getAllAdsOnData()
    }

    override suspend fun deleteAllAdsOnData() {
        adsOnDao.deleteAllAdsOnData()
    }

    override suspend fun insertOrder(orderDetails: OrderDetails) {
        return orderDetailsDao.insertOrder(orderDetails)
    }

    override suspend fun insertOrderList(orderDetails: List<OrderDetails>) {
        return orderDetailsDao.insertOrderList(orderDetails)
    }

    override suspend fun deleteOrder(orderDetails: OrderDetails) {
        return orderDetailsDao.deleteOrder(orderDetails)
    }

    override fun getOrderByItemId(id: String): Flow<List<OrderDetails>> {
       return orderDetailsDao.getOrderByItemId(id)
    }

    override fun getAllOrder(): Flow<List<OrderDetails>> {
       return orderDetailsDao.getAllOrder()
    }

    override suspend fun deleteAllOrder() {
        return  orderDetailsDao.deleteAllOrder()
    }
}