package com.corn.cornpos.data.database

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [UserInfoModel::class, LoginModel::class, Products::class, Category::class, Deals::class, Table::class, Customer::class,
                     AdsOn::class, OrderDetails::class
                     ], version = 1)
abstract class CornPosDataBase : RoomDatabase() {
abstract val userInfoDao:UserInfoDao
abstract val loginDao:LoginDao
abstract val productsDao:ProductsDao
abstract val categoryDao: CategoryDao
abstract val dealsDao: DealsDao
abstract val tableDeo: TableDeo
abstract val customerDao : CustomerDao
abstract val adsOnDao: AdsOnDao
abstract val orderDetailsDao : OrderDetailsDao

}

