package com.example.myyyyapplication
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "my_table")
data class MyEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val address: String,
    val phone: String,
    val website: String,
    val interests: String,
    val days: String,
    val hours: String,
    val price: String
)
