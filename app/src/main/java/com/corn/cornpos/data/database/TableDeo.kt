package com.corn.cornpos.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface TableDeo {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTable(table: Table)

    @Delete
    suspend fun deleteTable(table: Table)

    @Query("SELECT * FROM `Table` WHERE TableID =:id")
    fun getTableId(id: String): Flow<List<Table>>

    @Query("SELECT * FROM `Table`")
    fun getAllTableData(): Flow<List<Table>>

    @Query("DELETE FROM `Table`")
    suspend fun deleteAllTableData()


}