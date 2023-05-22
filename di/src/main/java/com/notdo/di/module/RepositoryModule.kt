package com.notdo.di.module

import com.notdo.feature_data_signup.data.repository.SignUpRepositoryImpl
import com.notdo.feature_domain_signup.domain.repository.SignUpRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun provideSignUpRepository(
        signUpRepositoryImpl: SignUpRepositoryImpl
    ): SignUpRepository
}