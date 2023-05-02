package com.notdo.di.module

import android.content.Context
import androidx.room.Room
import com.notdo.feature_domain_main.data.local.database.NotDoDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomDBModule {

    @Provides
    @Singleton
    fun provideNotDoDatabase(
        @ApplicationContext context: Context
    ): NotDoDataBase = Room
        .databaseBuilder(
            context,
            NotDoDataBase::class.java,
            "gcms_database"
        )
        .build()
}