package com.corn.cornpos.util

import com.corn.cornpos.data.database.Products

data class DealManager (
    val dealName : String,
    val categoryName: String,
    var productAddedCount: Int,
    var productList: MutableList<Products>
)