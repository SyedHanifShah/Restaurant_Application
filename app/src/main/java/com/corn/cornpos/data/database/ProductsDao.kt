package com.corn.cornpos.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface ProductsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProduct(products: Products)

    @Delete
    suspend fun deleteProduct(products: Products)

    @Query("SELECT * FROM Products WHERE CategoryID =:id")
    fun getProductId(id: String):Flow<List<Products>>

    @Query("SELECT * FROM Products")
    fun getAllProductData(): Flow<List<Products>>

    @Query("DELETE FROM Products")
    suspend fun deleteAllProductData()



}










