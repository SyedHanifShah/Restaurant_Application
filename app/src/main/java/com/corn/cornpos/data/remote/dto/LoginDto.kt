package com.corn.cornpos.data.remote.dto

data class LoginDto(
    val Access_Token: String,
    val Expires: String,
    val Expires_In: Int,
    val Issued: String,
    val Status: Boolean,
    val Token_Type: String,
    val UerInfo: UerInfo
)

