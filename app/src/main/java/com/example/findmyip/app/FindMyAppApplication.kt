package com.example.findmyip.app

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class FindMyAppApplication : Application() {
    init {
        Instance = this
    }

    companion object {
        private var Instance: FindMyAppApplication? = null
        fun applicationContext(): Context {
            return Instance!!.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()
    }
}