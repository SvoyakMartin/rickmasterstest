package ru.svoyakmartin.rickmasterstest.data.ds

import retrofit2.http.GET
import ru.svoyakmartin.rickmasterstest.data.model.CameraDTO
import ru.svoyakmartin.rickmasterstest.data.model.DoorDTO

interface ServiceApi {
    @GET("cameras")
    suspend fun getCameras(): List<CameraDTO>

    @GET("doors")
    suspend fun getDoors(): List<DoorDTO>
}