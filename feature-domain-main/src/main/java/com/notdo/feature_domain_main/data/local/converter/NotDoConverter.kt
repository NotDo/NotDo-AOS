package com.notdo.feature_domain_main.data.local.converter

import androidx.room.TypeConverter
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class NotDoConverter {
    @TypeConverter
    fun localDateTimeToString(localDate: LocalDate): String =
        localDate.format(DateTimeFormatter.ISO_DATE)

    @TypeConverter
    fun stringToLocalDateTime(string: String): LocalDate =
        LocalDate.parse(string, DateTimeFormatter.ISO_DATE)
}