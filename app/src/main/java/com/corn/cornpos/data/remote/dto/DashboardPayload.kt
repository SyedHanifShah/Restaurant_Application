package com.corn.cornpos.data.remote.dto

data class DashboardPayload(
    val Parameters: Parameters,
    val SpName: String
)

data class Parameters(
    val DistributorID: String
)