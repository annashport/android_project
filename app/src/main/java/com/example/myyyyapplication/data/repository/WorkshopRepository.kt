package com.example.myyyyapplication.data.repository

import com.example.myyyyapplication.data.source.remote.model.WorkshopModel

interface WorkshopRepository {

    suspend fun getWorkshops(): List<WorkshopModel>
}