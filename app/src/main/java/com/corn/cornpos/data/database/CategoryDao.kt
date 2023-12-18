package com.corn.cornpos.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface CategoryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategory(category: Category)

    @Delete
    suspend fun deleteCategory(category: Category)

    @Query("SELECT * FROM Category WHERE CategoryID =:id")
    suspend fun getCategoryId(id: String):Category?

    @Query("SELECT * FROM Category")
    fun getAllCategoryData(): Flow<List<Category>>


    @Query("DELETE FROM Category")
    suspend fun deleteAllCategoryData()


}







