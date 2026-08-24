package com.ott.session.usecase

import com.ott.session.configs.AppConfig
import com.ott.session.repository.ConfigRepository
import javax.inject.Inject

class GetConfigUseCase @Inject constructor(
    private val configRepository: ConfigRepository,
) {
    suspend operator fun invoke(): AppConfig = configRepository.getConfig()
}
