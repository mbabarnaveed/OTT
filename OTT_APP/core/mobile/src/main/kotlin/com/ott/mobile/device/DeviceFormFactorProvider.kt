package com.ott.mobile.device

import android.content.ComponentCallbacks
import android.content.Context
import android.content.res.Configuration
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DeviceFormFactorProvider @Inject constructor(
    @ApplicationContext context: Context,
) {
    private val appContext = context.applicationContext
    private val _formFactor = MutableStateFlow(resolveDeviceFormFactor(appContext))
    val formFactor: StateFlow<DeviceFormFactor> = _formFactor.asStateFlow()

    fun current(): DeviceFormFactor = _formFactor.value

    fun update(formFactor: DeviceFormFactor) {
        if (_formFactor.value != formFactor) {
            _formFactor.value = formFactor
        }
    }

    init {
        appContext.registerComponentCallbacks(object : ComponentCallbacks {
            override fun onConfigurationChanged(newConfig: Configuration) {
                _formFactor.value = resolveDeviceFormFactor(appContext, newConfig)
            }

            override fun onLowMemory() = Unit
        })
    }
}
