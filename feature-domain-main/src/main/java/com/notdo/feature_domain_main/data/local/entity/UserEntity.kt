package com.notdo.feature_domain_main.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.util.*

@Entity(tableName = "user")
data class UserEntity(
    @PrimaryKey
    val uuid: UUID,
    @ColumnInfo(name = "nickname")
    val nickname: String,
    @ColumnInfo(name = "createAt")
    val createAt: LocalDate,
    @ColumnInfo(name = "mood")
    val mood: Mood
)