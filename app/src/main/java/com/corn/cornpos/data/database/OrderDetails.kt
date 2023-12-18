package com.corn.cornpos.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class OrderDetails (
    @PrimaryKey(autoGenerate = true)
    val orderNumber :Int? = null,
    val itemName: String,
    val itemId: Int,
    val quantity: Int,
    val adsOnCategory:String? = null,
    val price: Int,
    val sectionName:String,
    val parentRowId:Int,
    val lngDealDetailID: Int? = null,
    val intDealID:Int? = null,
    val isDeal:Int,
    val parentDeal :String?
)
