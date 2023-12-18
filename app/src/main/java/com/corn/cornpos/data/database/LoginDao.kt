package com.corn.cornpos.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface LoginDao {
        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun insertLoginData(loginModel: LoginModel)

        @Delete
        suspend fun deleteLoginData(loginModel: LoginModel)

        @Query("SELECT * FROM LoginModel WHERE id =:id")
        suspend fun getLoginDataById(id: String):LoginModel?

        @Query("SELECT * FROM LoginModel")
        fun getAllLoginData(): Flow<LoginModel>
}