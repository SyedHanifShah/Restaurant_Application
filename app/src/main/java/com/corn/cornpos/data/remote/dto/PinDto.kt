package com.corn.cornpos.data.remote.dto

data class PinDto(
    val ClientConnString: String,
    val ClientId: Int,
    val ImagePath1: Any,
    val ImagePath2: Any,
    val ImageServerUrl: String,
    val Status: Boolean
)