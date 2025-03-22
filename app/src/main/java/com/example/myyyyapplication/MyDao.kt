package com.example.myyyyapplication
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MyDao {
    @Insert
    suspend fun insert(myEntity: MyEntity)

    @Query("SELECT * FROM my_table")
    suspend fun getAll(): List<MyEntity>


    @Query("SELECT * FROM my_table WHERE interests = :clubInterests")
    suspend fun getClubByInterests(clubInterests: String): MyEntity?
}