package com.corn.cornpos.data.remote.dto

import com.corn.cornpos.data.database.OrderDetails
import com.corn.cornpos.data.database.Products

data class Deal(
    val DealID: Int,
    val DealName: String,
    val DealQty: Int,
    val GSTPer: Any? =null,
    val IsFree: Any?= null,
    val IsModifiedItem: Any? = null,
    val IsUnGroup: Boolean,
    val IsVoid: Int,
    val Items: List<DealItem>,
    val KDSQty: Any?= null,
    val ModifierParentRowID: Int?= null,
    val OriginalQty: Any? = null,
    val Price: Int,
    val ProductCategoryID: Any? = null,
    val SaleMUnitCode: Any? = null,
    val VoidBy: Any? = null,
    val intDealID: Int?= null
)