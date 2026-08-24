package com.ott.session.repository

import android.content.Context
import com.ott.session.configs.AppConfig
import com.ott.session.configs.AppConfigData
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ConfigRepositoryImpl @Inject constructor(
    @ApplicationContext private val context: Context,
    private val json: Json,
) : ConfigRepository {

    @Volatile
    private var cachedConfig: AppConfig? = null
    private val mutex = Mutex()

    override suspend fun getConfig(): AppConfig {
        cachedConfig?.let { return it }
        return mutex.withLock {
            cachedConfig?.let { return@withLock it }
            val config = withContext(Dispatchers.IO) { loadFromAssets() }
            cachedConfig = config
            config
        }
    }

    override fun requireConfig(): AppConfig {
        return cachedConfig
            ?: error("AppConfig has not been loaded. Call GetConfigUseCase during startup first.")
    }

    private fun loadFromAssets(): AppConfig {
        return context.assets.open(CONFIG_ASSET_FILE).bufferedReader().use { reader ->
            json.decodeFromString<AppConfigData>(reader.readText())
        }
    }

    private companion object {
        const val CONFIG_ASSET_FILE = "config.json"
    }
}
