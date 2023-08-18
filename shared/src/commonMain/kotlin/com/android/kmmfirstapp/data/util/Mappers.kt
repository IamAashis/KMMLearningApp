package com.android.kmmfirstapp.data.util

import com.android.kmmfirstapp.data.remote.MovieRemote
import com.android.kmmfirstapp.domain.model.Movie

/**
 * Created by Aashis on 18,August,2023
 */

// convert data to data layer to domain layer
internal fun MovieRemote.toMovie(): Movie {
    return Movie(
        id = id,
        title = title,
        description = overview,
        imageUrl = posterImage?.let { getImageUrl(it) },
        releaseDate = releaseDate
    )
}

private fun getImageUrl(posterImage: String) = "https://image.tmdb.org/t/p/w500/$posterImage"