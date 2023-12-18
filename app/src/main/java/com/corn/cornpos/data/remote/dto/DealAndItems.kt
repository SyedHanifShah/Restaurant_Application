package com.corn.cornpos.data.remote.dto

import com.corn.cornpos.data.database.Products

data class DealAndItems(
    val items: OrderItems? = null,
    val deal: Deal? = null
)
