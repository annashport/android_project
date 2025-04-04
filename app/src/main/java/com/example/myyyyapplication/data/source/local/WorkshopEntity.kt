package com.example.myyyyapplication.data.source.local
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "my_table")
data class WorkshopEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val address: String,
    val phone: String,
    val website: String,
    val interests: String,
    val days: String,
    val hours: String,
    val price: String,
    val longitude: Double, // Додаємо поле довготи
    val latitude: Double
)
