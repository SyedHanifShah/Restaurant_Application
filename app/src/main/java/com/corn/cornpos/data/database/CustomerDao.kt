package com.corn.cornpos.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface CustomerDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCustomer(customer: Customer)

    @Delete
    suspend fun deleteCustomer(customer: Customer)

    @Query("SELECT * FROM Customer WHERE CustomerID =:id")
    suspend fun getCustomerBYId(id: String):Customer?

    @Query("SELECT * FROM Customer")
    fun getAllCustomer(): Flow<List<Customer>>

    @Query("Delete FROM Customer")
    suspend fun deleteAllCustomer()


}