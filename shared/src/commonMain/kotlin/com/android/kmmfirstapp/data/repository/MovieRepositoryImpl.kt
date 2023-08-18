package com.android.kmmfirstapp.data.repository

import com.android.kmmfirstapp.data.remote.RemoteDataSource
import com.android.kmmfirstapp.data.util.toMovie
import com.android.kmmfirstapp.domain.model.Movie
import com.android.kmmfirstapp.domain.repository.MovieRepository

/**
 * Created by Aashis on 18,August,2023
 */
internal class MovieRepositoryImpl(
    private val remoteDateSource: RemoteDataSource
): MovieRepository {

    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDateSource.getMovies(page = page).results!!.map {
            it.toMovie()
        }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDateSource.getMovie(movieId = movieId).toMovie()
    }
}