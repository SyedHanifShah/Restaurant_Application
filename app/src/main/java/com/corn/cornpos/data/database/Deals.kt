package com.corn.cornpos.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Deals(
    val CategoryID: Int,
    val CategoryName: String,
    val DealID: Int,
    val DealItemQuantity: Int,
    val DealItems: String,
    val DealName: String,
    val DealPrice: Double,
    @PrimaryKey
    val intDealID: Int
)