package com.ott.mobile.device

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalWindowInfo
import dagger.hilt.android.EntryPointAccessors

val LocalDeviceFormFactor = staticCompositionLocalOf<DeviceFormFactor> {
    error("DeviceFormFactor not provided")
}

@Composable
fun rememberDeviceFormFactor(): DeviceFormFactor {
    val context = LocalContext.current
    val configuration = LocalConfiguration.current
    val windowSize = LocalWindowInfo.current.containerSize
    val provider = remember(context) {
        EntryPointAccessors.fromApplication(
            context.applicationContext,
            DeviceFormFactorEntryPoint::class.java,
        ).deviceFormFactorProvider()
    }
    val formFactor = remember(configuration, windowSize) {
        resolveDeviceFormFactor(
            context = context,
            configuration = configuration,
            windowWidthPx = windowSize.width,
            windowHeightPx = windowSize.height,
        )
    }
    SideEffect {
        provider.update(formFactor)
    }
    return formFactor
}
