package com.corn.cornpos.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface UserInfoDao {

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun insertUserInfo(userInfoModel: UserInfoModel)

        @Delete
        suspend fun deleteUserInfo(userInfoModel: UserInfoModel)

        @Query("SELECT * FROM UserInfoModel WHERE id =:id")
        suspend fun getUserInfoById(id: String):UserInfoModel?

        @Query("SELECT * FROM UserInfoModel")
        fun getAllUserInfo(): Flow<UserInfoModel>

}