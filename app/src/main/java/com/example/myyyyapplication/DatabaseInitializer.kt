package com.example.myyyyapplication
import android.content.Context
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

object DatabaseInitializer {

    fun populateDatabase(context: Context, lifecycleOwner: LifecycleOwner, clubName: String) {
        val database = MyDatabase.getDatabase(context)

        val myEntities = listOf(
            MyEntity(
                name = "Клуб 1",
                address = "Адреса 1",
                phone = "1234567890",
                website = "www.club1.com",
                interests = "Малювання",
                days = "Пн-Пт",
                hours = "9-17",
                price = 10.0
            ),
            MyEntity(
                name = "Клуб 2",
                address = "Адреса 2",
                phone = "0987654321",
                website = "www.club2.com",
                interests = "Малювання",
                days = "Сб-Нд",
                hours = "10-18",
                price = 15.0
            ),

        )
        lifecycleOwner.lifecycleScope.launch {
            myEntities.forEach { entity ->
                database.myDao().insert(entity)
            }
        }
    }
}