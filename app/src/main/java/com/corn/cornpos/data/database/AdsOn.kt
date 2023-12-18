package com.corn.cornpos.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class AdsOn(
    @PrimaryKey(autoGenerate = true)
    val id : Int? = null,
    val AdsOnCategoryID: Int,
    val AdsOnCategoryName: String,

    val AdsOnID: Int,
    val AdsOnName: String,
    var ItemID: Int,
    val ItemName: String,
    val IsMultiSelectModifier :Boolean,
    val Price: Double
)