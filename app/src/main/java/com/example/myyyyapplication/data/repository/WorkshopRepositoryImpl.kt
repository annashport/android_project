package com.example.myyyyapplication.data.repository

import com.example.myyyyapplication.data.source.local.WorkshopDao
import com.example.myyyyapplication.data.source.local.WorkshopEntity
import com.example.myyyyapplication.data.source.remote.WorkshopRemoteDataSource
import com.example.myyyyapplication.data.source.remote.model.WorkshopModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class WorkshopRepositoryImpl(
    private val workshopRemoteDataSource: WorkshopRemoteDataSource,
    private val workshopDatabase: WorkshopDao,
): WorkshopRepository {

//    override suspend fun getWorkshops(): List<WorkshopModel> {
//        checkDBandLoad()
//        return workshopDatabase.getAll()
//            .map {
//                WorkshopModel(
//                    name = it.name,
//                    address = it.address,
//                    phone = it.phone,
//                    website = it.website,
//                    interests = it.interests,
//                    days = it.days,
//                    hours = it.hours,
//                    price = it.price,
//                    longitude = it.longitude,
//                    latitude = it.latitude,
//                )
//            }
//    }
override suspend fun getWorkshops(): List<WorkshopModel> = withContext(Dispatchers.IO){
    checkDBandLoad()
    return@withContext workshopDatabase.getAll()
        .map {
            WorkshopModel(
                name = it.name,
                address = it.address,
                phone = it.phone,
                website = it.website,
                interests = it.interests,
                days = it.days,
                hours = it.hours,
                price = it.price,
                longitude = it.longitude,
                latitude = it.latitude,
            )
        }
}

    //call before each database request
//    private suspend fun checkDBandLoad() {
//        if (workshopDatabase.isEmpty()) {
//           workshopDatabase.insertAll(
//               workshopRemoteDataSource.loadWorkshops()
//                   .map {
//                       WorkshopEntity(
//                           name = it.name,
//                           address = it.address,
//                           phone =  it.phone,
//                           website = it.website,
//                           interests = it.interests,
//                           days = it.days,
//                           hours = it.hours,
//                           price = it.price,
//                           longitude = it.longitude,
//                           latitude = it.latitude,
//                       )
//                   }
//           )
//        }
//    }
    private suspend fun checkDBandLoad() {
        withContext(Dispatchers.IO){
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
                                longitude = it.longitude,
                                latitude = it.latitude,
                            )
                        }
                )
            }
        }
    }
}