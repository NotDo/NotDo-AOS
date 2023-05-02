package com.notdo.feature_domain_main.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.util.*

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
    val isComplete: Boolean,
    @ColumnInfo(name = "createdAt")
    val createdAt: LocalDate,
    @ColumnInfo(name = "categoryId")
    val categoryId: UUID,
    @ColumnInfo(name = "notToDoId")
    val notToDoId: UUID
)
