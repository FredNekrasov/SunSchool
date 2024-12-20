package com.fredprojects.sunschool

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin

class SunSchoolApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@SunSchoolApp)
            androidLogger()
            modules()
        }
    }
    override fun onTerminate() {
        super.onTerminate()
        stopKoin()
    }
}