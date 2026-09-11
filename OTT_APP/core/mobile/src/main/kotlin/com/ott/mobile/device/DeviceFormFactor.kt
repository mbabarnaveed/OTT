package com.ott.mobile.device

import android.content.Context
import android.content.pm.PackageManager
import android.content.res.Configuration

data class DeviceFormFactor(
    val isPortrait: Boolean,
    val isLandscape: Boolean,
    val isMobile: Boolean,
    val isTablet: Boolean,
    val isFoldable: Boolean,
    val isFoldOpen: Boolean,
)

fun resolveDeviceFormFactor(
    context: Context,
    configuration: Configuration = context.resources.configuration,
    windowWidthPx: Int? = null,
    windowHeightPx: Int? = null,
): DeviceFormFactor {
    val isLandscape = if (windowWidthPx != null && windowHeightPx != null) {
        windowWidthPx > windowHeightPx
    } else {
        configuration.screenWidthDp > configuration.screenHeightDp
    }
    val isTablet = configuration.smallestScreenWidthDp >= TABLET_SMALLEST_WIDTH_DP
    val packageManager = context.packageManager
    val isFoldable = packageManager.hasSystemFeature(PackageManager.FEATURE_SENSOR_HINGE_ANGLE) ||
        packageManager.hasSystemFeature(FEATURE_FOLDABLE)
    val isFoldOpen = isFoldable && isTablet

    return DeviceFormFactor(
        isPortrait = !isLandscape,
        isLandscape = isLandscape,
        isMobile = !isTablet,
        isTablet = isTablet,
        isFoldable = isFoldable,
        isFoldOpen = isFoldOpen,
    )
}

private const val TABLET_SMALLEST_WIDTH_DP = 600
private const val FEATURE_FOLDABLE = "android.hardware.type.foldable"
