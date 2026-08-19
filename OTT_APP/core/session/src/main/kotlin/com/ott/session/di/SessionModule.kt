package com.ott.session.di

import android.content.Context
import com.ott.session.configs.AppConfig
import com.ott.session.manager.SessionManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SessionModule {

    @Provides
    @Singleton
    fun provideSessionManager(
        @ApplicationContext context: Context,
        appConfig: AppConfig
    ): SessionManager {
        return SessionManager(context, appConfig)
    }
}