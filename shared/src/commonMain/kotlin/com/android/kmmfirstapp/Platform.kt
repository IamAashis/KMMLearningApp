package com.android.kmmfirstapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform