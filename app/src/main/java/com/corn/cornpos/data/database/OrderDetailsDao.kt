package com.corn.cornpos.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface OrderDetailsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrder(orderDetails: OrderDetails)

    @Delete
    suspend fun deleteOrder(orderDetails: OrderDetails)

    @Query("SELECT * FROM orderdetails WHERE orderNumber =:id")
    fun getOrderByItemId(id: String): Flow<List<OrderDetails>>

    @Query("SELECT * FROM OrderDetails")
    fun getAllOrder(): Flow<List<OrderDetails>>

    @Query("Delete FROM OrderDetails")
    suspend fun deleteAllOrder()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOrderList(order: List<OrderDetails>)




}