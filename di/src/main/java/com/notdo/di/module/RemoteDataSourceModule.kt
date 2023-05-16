package com.notdo.di.module

import com.notdo.feature_domain_signup.data.remote.datasource.SignUpDataSource
import com.notdo.feature_domain_signup.data.remote.datasource.SignUpDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteDataSourceModule {
    @Binds
    abstract fun provideSignUpDataSource(
        signUpDataSource: SignUpDataSourceImpl
    ): SignUpDataSource
}