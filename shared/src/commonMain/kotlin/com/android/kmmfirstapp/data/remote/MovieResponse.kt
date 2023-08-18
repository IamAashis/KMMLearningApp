package com.android.kmmfirstapp.data.remote

import kotlinx.serialization.Serializable

/**
 * Created by Aashis on 16,August,2023
 */
@Serializable
internal data class MovieResponse(
    val results: List<MovieRemote>? = null
)
