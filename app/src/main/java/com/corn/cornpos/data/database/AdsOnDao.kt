package com.corn.cornpos.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface AdsOnDao
{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAdsOn(adsOn: AdsOn)

    @Delete
    suspend fun deleteAdsOn(adsOn: AdsOn)

    @Query("SELECT * FROM AdsOn WHERE ItemID =:id")
    fun getAdsOnByItemId(id: String): Flow<List<AdsOn>>

    @Query("SELECT * FROM AdsOn")
    fun getAllAdsOnData(): Flow<List<AdsOn>>

    @Query("DELETE FROM AdsOn")
    suspend fun deleteAllAdsOnData()

}