package com.corn.cornpos.data.remote.dto

import com.google.gson.annotations.SerializedName

data class LoginPayload(
    @SerializedName("UserName") val userName: String,
    @SerializedName("Password") val password: String,
    @SerializedName("Grant_Type") val grant_type: String,
)
