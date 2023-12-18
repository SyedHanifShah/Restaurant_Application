package com.corn.cornpos.data.remote.dto

import com.corn.cornpos.data.database.OrderDetails

data class DashboardDto(
    val Rows: List<Row>,
    val Status: Boolean,
    val TotalLength: Int
)



data class Row(
    val BankDiscountID: Int,
    val BankID: Any,
    val CoverTable: String,
    val Covers: String,
    val CreateDateTime: String,
    val CreditCardAccountTile: String,
    val CreditCardNo: String,
    val CustomerID: Int,
    val CustomerID1: Any,
    val CustomerName: Any,
    val DeliveryChannel: Int,
    val Discount: Double,
    val DiscountType: Int,
    val GSTAmount: Double,
    val GSTPer: Double,
    val GrossAmount: Double,
    val InvoiceNo: Int,
    val ItemWiseDiscount: Double,
    val ManualOrderNo: String,
    val NetAmount: Double,
    val OrderDetail: String,
    val OrderID: Int,
    val OrderNO: String,
    val OrderTakeId: Int,
    val PaymentMode: Int,
    val PaymentReceived: Double,
    val Remarks: String,
    val ServiceCharges: Double,
    val ServiceChargesType: Int,
    val ServiceTypeID: Int,
    val TableDetail: String?,
    val TableID: String
)