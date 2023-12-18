package com.corn.cornpos.data.remote.dto

data class MYOrder(
    val OrderID: Int,
    val ID: Int,
    val Name: String,
    val Price: Double,
    val Amount: Double,
    val IsVoid: Boolean,
    val Qty: Double,
    val Discount: Double,
    val ItemWiseGST: Double,
    val IsAddsOn: Boolean,
    val IsDeal: Int,
    val DealID: Int,
    val DealQty: Double,
    val IsHasAddsOn: Boolean,
    val ModifierParentID: Int,
    val ModifierParentRowID: Int,
    val InvoiceDetailID: Int,
    val SectionID: Int,
    val SectionName: String,
    val IsFree: Int,
    val OrderNotes: String
)