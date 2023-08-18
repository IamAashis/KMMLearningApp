package com.android.kmmfirstapp.data.remote

import com.android.kmmfirstapp.util.Dispatcher
import kotlinx.coroutines.withContext

/**
 * Created by Aashis on 18,August,2023
 */
internal class RemoteDataSource(
    private val apiService: MovieService,
    private val dispatcher: Dispatcher
) {

    suspend fun getMovies(page: Int) = withContext(dispatcher.io) {
        apiService.getMovies(page = page)
    }

    suspend fun getMovie(movieId: Int) = withContext(dispatcher.io) {
        apiService.getMovie(movieId = movieId)
    }

}