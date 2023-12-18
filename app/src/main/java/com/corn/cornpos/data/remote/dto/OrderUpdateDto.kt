package com.corn.cornpos.data.remote.dto

data class OrderUpdateDto(
    val Rows: List<UpdateRow>,
    val Status: Boolean,
    val TotalLength: Int
)