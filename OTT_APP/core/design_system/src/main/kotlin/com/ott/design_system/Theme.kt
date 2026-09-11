package com.ott.design_system

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

private val LocalColorScheme = staticCompositionLocalOf<AppColors> {
    error("CompositionLocal LocalColorScheme not present")
}

private val LocalTypography = staticCompositionLocalOf<AppTypography> {
    error("CompositionLocal LocalTypography not present")
}

data class AppColors(
    val focus : Color, //Structure
    val accent : Color, //Structure
    val slate : Color, //Structure
    val light : Color, //Structure
    val body : Color, //Surface/Background
    val pop : Color, //Surface/Background
    val overlay : Color, //Surface/Background
    val black : Color, //Surface/Background
    val fade : Color, // Transparency/Neutrals
    val errorOrLive : Color, //States
    val warningOrAds: Color,
    val success: Color
)

@Composable
fun AppTheme(
    colorScheme: AppColors = defaultColorScheme,
    typography: AppTypography = defaultTypography,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalColorScheme provides colorScheme,
        LocalTypography provides typography,
    ) {
        MaterialTheme(
            content = content
        )
    }
}

object AppTheme {
    val colorScheme: AppColors
        @Composable @ReadOnlyComposable get() = LocalColorScheme.current

    val typography: AppTypography
        @Composable @ReadOnlyComposable get() = LocalTypography.current
}
