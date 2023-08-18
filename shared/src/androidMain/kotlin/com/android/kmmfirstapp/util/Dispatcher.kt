package com.android.kmmfirstapp.util

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 * Created by Aashis on 18,August,2023
 */

internal class AndroidDispatcher: Dispatcher{
    override val io: CoroutineDispatcher
        get() = Dispatchers.IO
}

internal actual fun provideDispatcher(): Dispatcher = AndroidDispatcher()