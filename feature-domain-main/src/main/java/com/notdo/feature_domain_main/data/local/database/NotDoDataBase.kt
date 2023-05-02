package com.notdo.feature_domain_main.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.notdo.feature_domain_main.data.local.converter.NotDoConverter
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
@TypeConverters(NotDoConverter::class)
abstract class NotDoDataBase : RoomDatabase() {
}