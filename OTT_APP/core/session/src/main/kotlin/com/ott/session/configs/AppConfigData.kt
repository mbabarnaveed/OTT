package com.ott.session.configs

import kotlinx.serialization.Serializable

@Serializable
data class AppConfigData(
    override val forceUpdate: Boolean,
    override val version: String,
    override val country: String,
    override val baseLang: String,
    override val tenantId: Int,
    override val translation_url: String,
    override val languages: List<String>,
) : AppConfig
