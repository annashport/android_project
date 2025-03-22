package com.example.myyyyapplication

import android.app.Application
import com.example.myyyyapplication.data.repository.WorkshopRepository
import com.example.myyyyapplication.data.repository.WorkshopRepositoryImpl
import com.example.myyyyapplication.data.source.local.WorkshopDatabase
import com.example.myyyyapplication.data.source.remote.WorkshopMockDataSourceImpl
import com.example.myyyyapplication.data.source.remote.WorkshopRemoteDataSource
import com.example.myyyyapplication.presentation.viewmodel.InterestsViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin()
    }
    
    private fun initKoin() {
        startKoin {
            // Log Koin into Android logger
            androidLogger()
            // Reference Android context
            androidContext(this@MyApplication)
            // Load modules
            modules(getKoinModule())
        }
    }

    private fun getKoinModule() : Module = module {
        single { WorkshopDatabase.getDatabase(this@MyApplication).myDao() }
        factory<WorkshopRemoteDataSource> { WorkshopMockDataSourceImpl() }
        factory<WorkshopRepository> { WorkshopRepositoryImpl(get(), get()) }
        viewModel { InterestsViewModel(get()) }
    }
}