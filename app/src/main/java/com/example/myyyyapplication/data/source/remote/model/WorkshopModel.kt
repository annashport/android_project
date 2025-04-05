package com.example.myyyyapplication.data.source.remote.model

data class WorkshopModel(
    val id: Int = 0,
    val name: String,
    val address: String,
    val phone: String,
    val website: String,
    val interests: String,
    val days: String,
    val hours: String,
    val price: String,
    val longitude: Double,
    val latitude: Double,
    val isLiked: Boolean = false,
)
