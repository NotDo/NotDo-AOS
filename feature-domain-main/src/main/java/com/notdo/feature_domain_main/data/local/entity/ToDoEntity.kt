package com.notdo.feature_domain_main.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(
    tableName = "Todo",
    foreignKeys = [ForeignKey(
        entity = UserEntity::class,
        parentColumns = ["uuid"],
        childColumns = ["uuid"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class ToDoEntity(
    @PrimaryKey
    val id: UUID,
    @ColumnInfo(name = "content")
    val content: String,
    @ColumnInfo(name = "isComplete")
    val isComplete: String,
    @ColumnInfo(name = "isRepeat")
    val isRepeat: String,
    @ColumnInfo(name = "uuid")
    val uuid: UUID
)
