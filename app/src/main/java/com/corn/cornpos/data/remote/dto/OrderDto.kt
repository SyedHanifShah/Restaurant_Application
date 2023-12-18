package com.corn.cornpos.data.remote.dto





data class OrderDto(
    val Rows: List<List<OwnOrder>>,
    val Status: Boolean,
    val TotalLength: Int
)

data class OwnOrder(
    val Column1: Int,
    val OrderNo: String,
    val s: String
)


data class Order(
    val OrderID: String,
    val ServiceTypeID: Int,
val UserID: Int,
val PaymentMode: Int,
val TableID: Int,
val GrossAmount: Int,
val IsHold: Int,
val CoverTable: Int,
val CustomerID: Int,
val ManualOrderNo: Int? = null,
val Remarks: String?= null,
val GSTAmount: Int,
val DeliveryChannel: Int,
val Items: List<Any>,
val ItemLog: List<String>,
val ItemWiseDiscount: Int,
val GSTPer: Int,
val OrderTakeId: Int,
val ServiceCharges: Int,
val ServiceChargesType: Int,
val Discount: Int,
val DiscountType: Int,
val BankID: Int,
val PaymentReceived: Int,
val Cancelled: Int,
val CashImpact: Int,
val TakeawayCustomerName: String?= null,
val ApprovedBy: String?= null,
val EmpDiscountType: String?= null,
val EmpUserID: Int?= null,
val ManagerUserID: Int?= null,
val ManagerPWD: Int?= null,
val strCardNo: Int?= null,
val Purchasing: Int?= null,
val InvoiceNumberFBR: Int?= null,
val KDSTime: Int?= null,
val CreditCardNo: Int? = null,
val CreditCardAccountTile: Int? = null,
val NetAmount: Int? = null,
)