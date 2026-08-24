package com.ott.session.repository

import com.ott.session.configs.AppConfig

interface ConfigRepository {
    suspend fun getConfig(): AppConfig
    fun requireConfig(): AppConfig
}
