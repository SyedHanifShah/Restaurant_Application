package com.corn.cornpos.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.corn.cornpos.data.remote.dto.UerInfo


@Entity
data class LoginModel(
    @PrimaryKey(autoGenerate = true)
    val id:Int? = null,
    val Access_Token: String,
    val Expires: String,
    val Expires_In: Int,
    val Issued: String,
    val Status: Boolean,
    val Token_Type: String,
)
