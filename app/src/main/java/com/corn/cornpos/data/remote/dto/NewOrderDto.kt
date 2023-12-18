package com.corn.cornpos.data.remote.dto

data class NewOrderDto(
    val Rows: List<List<RowX>>,
    val Status: Boolean,
    val TotalLength: Int
)

data class RowX(
    val Column1: Int,
    val OrderNo: String,
    val s: String
)