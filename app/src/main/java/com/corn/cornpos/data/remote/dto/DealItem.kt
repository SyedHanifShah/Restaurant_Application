package com.corn.cornpos.data.remote.dto

data class DealItem(
    val GSTPer: Any?= null,
    val ID: Int,
    val IsFree: Any?= null,
    val IsModifiedItem: Any?= null,
    val IsUnGroup: Boolean,
    val IsVoid: Int,
    val ItemWiseGST: Int,
    val KDSQty: Any?= null,
    val Price: Int?= null,
    val ModifierParentRowID: Int,
    val Name: String,
    val OrderNotes: String,
    val OriginalQty: Any?= null,
    val ProductCategoryID: Any?= null,
    val SaleMUnitCode: Any?= null,
    val SectionName: String,
    val VoidBy: Any?= null,
//    val lngDealDetailID: Int
)