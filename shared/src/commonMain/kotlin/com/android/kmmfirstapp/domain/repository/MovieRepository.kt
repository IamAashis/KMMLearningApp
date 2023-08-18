package com.android.kmmfirstapp.domain.repository

import com.android.kmmfirstapp.domain.model.Movie

internal interface MovieRepository {
    suspend fun getMovies(page: Int): List<Movie>

    suspend fun getMovie(movieId: Int): Movie
}