package com.ott.session.usecase

import com.ott.session.configs.AppConfig
import javax.inject.Inject

class GetStartupUseCase @Inject constructor(
    private val getConfigUseCase: GetConfigUseCase,
) {
    suspend operator fun invoke(): AppConfig {
        val config = getConfigUseCase()
        return config
    }
}
