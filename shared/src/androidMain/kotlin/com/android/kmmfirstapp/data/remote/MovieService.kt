package com.android.kmmfirstapp.data.remote

import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter

/**
 * Created by Aashis on 16,August,2023
 */
class MovieService: KtorApi() {

    suspend fun getMovies(page: Int = 1): MovieResponse = client.get {
        pathUrl("movie/popular")
        parameter("page", page)
    }.body()

    suspend fun getMovie(movieId: Int): MovieData = client.get {
        pathUrl("movie/${movieId}")
    }.body()
}