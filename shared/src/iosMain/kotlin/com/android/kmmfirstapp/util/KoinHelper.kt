package com.android.kmmfirstapp.util

import com.android.kmmfirstapp.di.getSharedModules
import org.koin.core.context.startKoin

fun initKoin(){
    startKoin {
        modules(getSharedModules())
    }
}