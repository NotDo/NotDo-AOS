package com.notdo.di.module

import com.notdo.feature_data_signup.data.remote.datasource.SignUpDataSource
import com.notdo.feature_data_signup.data.remote.datasource.SignUpDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteDataSourceModule {
    @Singleton
    @Binds
    abstract fun provideSignUpDataSource(
        signUpDataSourceImpl: SignUpDataSourceImpl
    ): SignUpDataSource
}