package com.corn.cornpos.data.remote.dto


data class Payload(
    val SpName: String,
    val Parameters: OrderParameters
)


data class JsonString(
    val Orders: List<Order>
)


data class OrderParameters(
    val JsonString: JsonString,
    val DistributorID: String
)