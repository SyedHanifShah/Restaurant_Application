package com.corn.cornpos.data.remote

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
import com.corn.cornpos.util.Constants.Companion.DASHBOARD_ENDPOINT
import com.corn.cornpos.util.Constants.Companion.LOGIN_ENDPOINT
import com.corn.cornpos.util.Constants.Companion.PIN_VALIDATION
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface CornPosApi {

        @GET(PIN_VALIDATION)
        suspend fun pinValidation(
                @Query("Pin") pin:String,
                ):Response<PinDto>



        @POST(LOGIN_ENDPOINT)
        suspend fun login(
                @Header("x-conn") xConn:String,
                @Body payload: LoginPayload
                ):Response<LoginDto>

        @POST(DASHBOARD_ENDPOINT)
        suspend fun dashboard(
                @Header("x-conn") xConn:String,
                @Header("authorization") authorization:String,
                @Body payload: DashboardPayload
                ):Response<DashboardDto>


        @POST(DASHBOARD_ENDPOINT)
        suspend fun masterData(
                @Header("x-conn") xConn:String,
                @Header("authorization") authorization:String,
                @Body payload: DashboardPayload
                ):Response<MasterData>

        @POST(DASHBOARD_ENDPOINT)
        suspend fun saveOrder(
                @Header("x-conn") xConn:String,
                @Header("authorization") authorization:String,
                @Body payload: Payload
                ):Response<NewOrderDto>

        @POST(DASHBOARD_ENDPOINT)
        suspend fun updateOrder(
                @Header("x-conn") xConn:String,
                @Header("authorization") authorization:String,
                @Body payload: Payload
        ):Response<OrderUpdateDto>


}