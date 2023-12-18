package com.corn.cornpos.data.remote.dto

data class OrderItems(
    val Discount: Int,
    val GSTPer: Int? = null,
    val ID: Int,
    val IsFree: Boolean? = null,
    val IsModifiedItem: String? = null,
    val IsUnGroup: Boolean,
    val IsVoid: Int,
    val IsDeal :Int,
    val ItemWiseGST: Int,
    val KDSQty: String? = null,
    val ModifierParentRowID: Int,
    val Name: String,
    val OrderNotes: String? = null,
    val OriginalQty: Int? = null,
    val Price: Int,
    val ProductCategoryID: Int? = null,
    val Qty: Int,
    val SaleMUnitCode: Int? = null,
    val SectionName: String,
    val VoidBy: String? = null
)
