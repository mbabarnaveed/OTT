package com.ott.design_system

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import ott.core.designsystem.R

private val LocalColorScheme = staticCompositionLocalOf<AppColors> {
    error("CompositionLocal LocalColorScheme not present")
}

private val LocalStepInFontScheme = staticCompositionLocalOf<FontFamily> {
    error("CompositionLocal LocalStepInFontScheme not present")
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

private data class AppInterface(
    val colors: AppColors,
    val fonts: FontFamily
)

@Composable
fun AppTheme(
    colorScheme: AppColors = defaultColorScheme,
    content: @Composable () -> Unit
) {
    val interfaceTheme = AppInterface(
        colors = colorScheme,
        fonts = YettelFontFamily)

    CompositionLocalProvider(
        LocalColorScheme provides interfaceTheme.colors,
          LocalStepInFontScheme provides interfaceTheme.fonts,
    ) {
        MaterialTheme(
            content = content
        )
    }
}

object AppTheme {
    val colorScheme: AppColors
        @Composable @ReadOnlyComposable get() = LocalColorScheme.current

    val fontScheme: FontFamily
        @Composable @ReadOnlyComposable get() = LocalStepInFontScheme.current

}
