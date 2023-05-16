package com.notdo.di.module

import com.notdo.feature_domain_signup.data.repository.SignUpRepositoryImpl
import com.notdo.feature_domain_signup.domain.repository.SignUpRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun provideSignUpRepository(
        signUpRepository: SignUpRepositoryImpl
    ): SignUpRepository
}