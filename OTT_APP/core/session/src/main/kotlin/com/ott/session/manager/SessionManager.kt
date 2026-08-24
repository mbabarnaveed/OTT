package com.ott.session.manager

import android.content.Context
import com.ott.session.configs.AppConfig
import com.ott.session.repository.ConfigRepository
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SessionManager @Inject constructor(
    @ApplicationContext private val context: Context,
    private val configRepository: ConfigRepository,
) {
    val appConfig: AppConfig
        get() = configRepository.requireConfig()
}
