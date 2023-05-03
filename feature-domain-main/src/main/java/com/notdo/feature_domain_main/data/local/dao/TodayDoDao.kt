package com.notdo.feature_domain_main.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.notdo.feature_domain_main.data.local.entity.ToDoEntity
import java.util.UUID

@Dao
interface TodayDoDao {

    @Query("SELECT * FROM Todo WHERE userId = :userId")
    suspend fun getTodayDo(userId: UUID): ToDoEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodayDo(todayDo: ToDoEntity)

    @Query("DELETE FROM Todo WHERE id = :id")
    suspend fun deleteTodayDo(id: UUID)

}