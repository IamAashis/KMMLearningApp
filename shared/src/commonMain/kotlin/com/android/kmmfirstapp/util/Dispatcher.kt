package com.android.kmmfirstapp.util

import kotlinx.coroutines.CoroutineDispatcher

/**
 * Created by Aashis on 16,August,2023
 */
internal interface Dispatcher {
    val io: CoroutineDispatcher
}

internal expect fun provideDispatcher(): Dispatcher