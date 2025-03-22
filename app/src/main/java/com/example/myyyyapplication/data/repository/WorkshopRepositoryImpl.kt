package com.example.myyyyapplication.data.repository

import android.content.Context
import com.example.myyyyapplication.data.source.local.WorkshopDao
import com.example.myyyyapplication.data.source.local.WorkshopDatabase
import com.example.myyyyapplication.data.source.local.WorkshopEntity
import com.example.myyyyapplication.data.source.remote.WorkshopMockDataSourceImpl
import com.example.myyyyapplication.data.source.remote.WorkshopRemoteDataSource
import com.example.myyyyapplication.data.source.remote.model.WorkshopModel

class WorkshopRepositoryImpl(
    private val workshopRemoteDataSource: WorkshopRemoteDataSource,
    private val workshopDatabase: WorkshopDao,
): WorkshopRepository {

    override suspend fun getWorkshops(): List<WorkshopModel> {
        checkDBandLoad()
        return workshopDatabase.getAll()
            .map {
                WorkshopModel(
                    name = it.name,
                    address = it.address,
                    phone =  it.phone,
                    website = it.website,
                    interests = it.interests,
                    days = it.days,
                    hours = it.hours,
                    price = it.price,
                )
            }
    }

    private suspend fun checkDBandLoad() {
        if (workshopDatabase.isEmpty()) {
           workshopDatabase.insertAll(
               workshopRemoteDataSource.loadWorkshops()
                   .map {
                       WorkshopEntity(
                           name = it.name,
                           address = it.address,
                           phone =  it.phone,
                           website = it.website,
                           interests = it.interests,
                           days = it.days,
                           hours = it.hours,
                           price = it.price,
                       )
                   }
           )
        }
    }
}