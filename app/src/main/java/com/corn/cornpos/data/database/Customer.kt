package com.corn.cornpos.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Customer(
    val Address: String,
    val CNIC: String,
    val CardID: String,
    val CustomerCode: String,
    @PrimaryKey
    val CustomerID: Int,
    val CustomerImage: String,
    val CustomerName: String,
    val DistributorID: Int,
    val EmailAddress: String,
    val Gender: String,
    val Nature: String,
    val OtherContactNo: String,
    val Points: Double,
    val PrimaryContact: String,
    val ProfessionID: Int
)