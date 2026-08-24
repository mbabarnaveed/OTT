package com.ott.session.di

import com.ott.session.repository.ConfigRepository
import com.ott.session.repository.ConfigRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class SessionModule {

    @Binds
    @Singleton
    abstract fun bindConfigRepository(
        impl: ConfigRepositoryImpl,
    ): ConfigRepository

    companion object {
        @Provides
        @Singleton
        fun provideJson(): Json = Json {
            ignoreUnknownKeys = true
            isLenient = true
        }
    }
}
