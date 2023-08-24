package com.android.kmmfirstapp.android

import android.app.Application
import com.android.kmmfirstapp.android.di.appModule
import com.android.kmmfirstapp.di.getSharedModules
import org.koin.core.context.startKoin

class Movie: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModules())
        }
    }
}