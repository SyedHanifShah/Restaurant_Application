package com.corn.cornpos.repository

import com.corn.cornpos.data.remote.dto.DashboardDto
import com.corn.cornpos.data.remote.dto.DashboardPayload
import com.corn.cornpos.data.remote.dto.LoginDto
import com.corn.cornpos.data.remote.dto.LoginPayload
import com.corn.cornpos.data.remote.dto.MasterData
import com.corn.cornpos.data.remote.dto.NewOrderDto
import com.corn.cornpos.data.remote.dto.OrderDto
import com.corn.cornpos.data.remote.dto.OrderUpdateDto
import com.corn.cornpos.data.remote.dto.Payload
import com.corn.cornpos.data.remote.dto.PinDto
import retrofit2.Response

interface CornPosRepository {

        suspend fun pinValidation(Pin: String): Response<PinDto>
        suspend fun login(xConn:String,payload: LoginPayload ): Response<LoginDto>
        suspend fun dashboard(xConn:String, authorization:String, payload: DashboardPayload ): Response<DashboardDto>
        suspend fun masterData(xConn:String, authorization:String, payload: DashboardPayload ): Response<MasterData>
        suspend fun saveOrder(xConn:String, authorization:String, payload: Payload ): Response<NewOrderDto>
        suspend fun updateOrder(xConn:String, authorization:String, payload: Payload ): Response<OrderUpdateDto>
}