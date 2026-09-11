package com.ott.design_system

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import ott.core.designsystem.R

/**
 * Design token weights map to Yettel files:
 * Regular -> Light, Semibold -> Regular, Bold -> Bold.
 */
object YettelFontWeights {
    val Regular = FontWeight.Light
    val Semibold = FontWeight.Normal
    val Bold = FontWeight.Bold
}

val YettelFontFamily = FontFamily(
    Font(R.font.yettel_light, YettelFontWeights.Regular),
    Font(R.font.yettel_regular, YettelFontWeights.Semibold),
    Font(R.font.yettel_bold, YettelFontWeights.Bold),
)
