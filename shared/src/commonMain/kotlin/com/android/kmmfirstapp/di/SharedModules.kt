package com.android.kmmfirstapp.di

import com.android.kmmfirstapp.data.remote.MovieService
import com.android.kmmfirstapp.data.remote.RemoteDataSource
import com.android.kmmfirstapp.data.repository.MovieRepositoryImpl
import com.android.kmmfirstapp.domain.repository.MovieRepository
import com.android.kmmfirstapp.domain.usecase.GetMovieUseCase
import com.android.kmmfirstapp.domain.usecase.GetMoviesUseCase
import com.android.kmmfirstapp.util.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModules() = sharedModules












