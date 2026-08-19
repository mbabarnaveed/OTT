package com.ott.common.configs

data class AppConfig(
    val forceUpdate: Boolean,
    val version: String,
    val country: String,
    val baseLang: String,
    val tenantId: Int,
    val translation_url: String,
    val languages: List<String>
)
