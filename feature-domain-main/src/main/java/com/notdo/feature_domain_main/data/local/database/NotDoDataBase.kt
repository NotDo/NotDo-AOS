package com.notdo.feature_domain_main.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.notdo.feature_domain_main.data.local.entity.*

@Database(
    entities = [
        UserEntity::class,
        ToDoEntity::class,
        CategoryEntity::class,
        NotToDoEntity::class,
        HistoryEntity::class
    ],
    version = 1
)
abstract class NotDoDataBase : RoomDatabase() {
}