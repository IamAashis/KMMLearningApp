package com.android.kmmfirstapp.android.di

import com.android.kmmfirstapp.android.detail.DetailViewModel
import com.android.kmmfirstapp.android.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { params -> DetailViewModel(getMovieUseCase = get(), movieId = params.get()) }
}