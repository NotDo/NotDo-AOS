package com.notdo.feature_domain_main.data.local.converter

import androidx.room.TypeConverter
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class NotDoConverter {
    @TypeConverter
    fun localDateTimeToString(localDateTime: LocalDateTime): String =
        localDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)

    @TypeConverter
    fun stringToLocalDateTime(string: String): LocalDateTime =
        LocalDateTime.parse(string, DateTimeFormatter.ISO_ZONED_DATE_TIME)
}