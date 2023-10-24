package com.example.findmyip.utils

import com.example.findmyip.model.FindMyIpModel

sealed class ApiState{

    class Success(val data:FindMyIpModel ) : ApiState()
    class Failure(val msg:Throwable) : ApiState()
    object Loading : ApiState()
    object Empty : ApiState()

}