package com.corn.cornpos.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Table(
    val BookingFrom: String,
    val BookingTo: String,
    val CustomerID: Int,
    val FloorID: Int,
    val FloorName: String,
    @PrimaryKey
    val TableID: Int,
    val TableNo: String
)