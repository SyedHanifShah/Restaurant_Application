package com.corn.cornpos.repository

import android.util.Log
import com.corn.cornpos.data.remote.CornPosApi
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
import javax.inject.Inject

 class CornPosRepositoryImpl @Inject constructor (
     private val api : CornPosApi

 ):CornPosRepository{

     override suspend fun pinValidation(Pin: String): Response<PinDto> {
       return  api.pinValidation(pin = Pin)
     }

     override suspend fun login(xConn: String, payload: LoginPayload): Response<LoginDto> {
         return api.login(xConn, payload)
     }

     override suspend fun dashboard(
         xConn: String,
         authorization: String,
         payload: DashboardPayload
     ): Response<DashboardDto> {
        return api.dashboard(xConn,authorization, payload)
     }

     override suspend fun masterData(
         xConn: String,
         authorization: String,
         payload: DashboardPayload
     ): Response<MasterData> {
         return api.masterData(xConn, authorization, payload)
     }

     override suspend fun saveOrder(
         xConn: String,
         authorization: String,
         payload: Payload
     ): Response<NewOrderDto> {
         Log.d("TAG", "saveOrder: payload ${payload}")
        return api.saveOrder(xConn, authorization, payload)
     }

     override suspend fun updateOrder(
         xConn: String,
         authorization: String,
         payload: Payload
     ): Response<OrderUpdateDto> {
         Log.d("TAG", "updateOrder: payload ${payload}")
         return api.updateOrder(xConn, authorization, payload)
     }

 }
