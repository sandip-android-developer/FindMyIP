package com.example.findmyip.remote

import com.example.findmyip.constants.AppConstant
import com.example.findmyip.model.FindMyIpModel
import retrofit2.http.GET

interface ApiService {
    @GET(AppConstant.API)
    suspend fun getIP(): FindMyIpModel
}