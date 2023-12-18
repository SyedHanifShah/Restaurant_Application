package com.corn.cornpos.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Products(
    @PrimaryKey
    val ItemID: Int,
    val CategoryID: Int,
    val DiscountPer: Int,
    val DiscountPrice: Int,
    val Favourite: Int,
    val ImagePath: String,
    val IsAddsOn: Int,
    val IsDeal: Boolean,
    val IsHasAddsOn: Int,
    val IsUnGroup: Boolean,
    val ItemCode: String,
    val ItemName: String,
    val Price: Double,
    val Rating: Int,
    val SectionID: Int,
    val SectionName: String
)