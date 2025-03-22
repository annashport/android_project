package com.example.myyyyapplication.data.source.local
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [WorkshopEntity::class], version = 1)
abstract class WorkshopDatabase : RoomDatabase() {
    abstract fun myDao(): WorkshopDao

    companion object {

        @Volatile
        private var INSTANCE: WorkshopDatabase? = null

        fun getDatabase(context: Context): WorkshopDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WorkshopDatabase::class.java,
                    "my_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }

    
}