package com.corn.cornpos.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface DealsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDeals(deals: Deals)

    @Delete
    suspend fun deleteDeals(deals: Deals)

    @Query("SELECT * FROM DEALS WHERE DealID =:id")
    suspend fun getDealsBYId(id: String):Deals?

    @Query("SELECT * FROM Deals")
    fun getAllDeals(): Flow<List<Deals>>

    @Query("DELETE FROM Deals")
    suspend fun deleteAllDeals()



}