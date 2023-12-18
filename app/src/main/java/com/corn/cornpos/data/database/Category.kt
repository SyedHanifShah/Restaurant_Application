package com.corn.cornpos.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Category(
    @PrimaryKey
    val CategoryID: Int,
    val Category: String,
    val ImagePath: String,
    val ParentCategoryID: Int,
    val ProductCount: Int
)