package com.android.kmmfirstapp.domain.model

/**
 * Created by Aashis on 18,August,2023
 */
data class Movie(
    val id: Int? = null,
    var title: String? = null,
    var description: String? = null,
    var imageUrl: String? = null,
    var releaseDate: String? = null
)
