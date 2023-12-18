package com.corn.cornpos.data.remote.dto

data class UerInfo(
    val Can_Delivery: Boolean,
    val Can_DineIn: Boolean,
    val Can_TakeAway: Boolean,
    val DealColumn: Int,
    val DefaultServiceType: String,
    val DefaultServiceTypeID: Int,
    val DistributionID: Int,
    val DistributionName: String,
    val DistributorName: String,
    val DistributorTypeID: Int,
    val EncryptKey: String,
    val IS_CanGiveDiscount: Boolean,
    val IsDistributorRegister: Int,
    val IsEncrypted: Boolean,
    val OTPicturesManadatory: Boolean,
    val RoleID: Int,
    val UserId: Int,
    val UserName: String,
    val WorkingDate: String
)