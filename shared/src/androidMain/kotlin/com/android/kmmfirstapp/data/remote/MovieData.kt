package com.android.kmmfirstapp.data.remote

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by Aashis on 16,August,2023
 */
@Serializable
data class MovieData(
    val id: Int? = null,
    val title: String? = null,
    val overview: String? = null,
    @SerialName("poster_path") val posterImage: String? = null,
    @SerialName("releaseDate") val releaseDate: String? = null
)
