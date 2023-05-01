package com.notdo.feature_domain_main.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.time.LocalDateTime
import java.util.UUID

@Entity(
    tableName = "History",
    foreignKeys = [ForeignKey(
        entity = NotToDoEntity::class,
        parentColumns = ["id"],
        childColumns = ["notToDoId"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class HistoryEntity(
    @PrimaryKey
    val id: UUID,
    @ColumnInfo(name = "isComplete")
    val isComplete: String,
    @ColumnInfo(name = "createdAt")
    val createdAt: LocalDateTime,
    @ColumnInfo(name = "categoryId")
    val categoryId: UUID,
    @ColumnInfo(name = "notToDoId")
    val notToDoId: UUID
)
