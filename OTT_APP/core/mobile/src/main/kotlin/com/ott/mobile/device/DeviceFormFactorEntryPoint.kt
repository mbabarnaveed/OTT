package com.ott.mobile.device

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface DeviceFormFactorEntryPoint {
    fun deviceFormFactorProvider(): DeviceFormFactorProvider
}
