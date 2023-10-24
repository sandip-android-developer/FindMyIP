package com.example.findmyip.repository.remote

import com.example.findmyip.model.FindMyIpModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiService: ApiService) {

    fun getIp(): Flow<FindMyIpModel> = flow {
        emit(apiService.getIP())
    }.flowOn(Dispatchers.IO)
}