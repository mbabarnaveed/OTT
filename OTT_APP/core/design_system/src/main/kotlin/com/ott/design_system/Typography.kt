package com.ott.design_system

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

data class TypeScale(
    val regular: TextStyle,
    val semibold: TextStyle,
    val bold: TextStyle,

)

data class AppTypography(
    val h1: TypeScale,
    val h2: TypeScale,
    val h3: TypeScale,
    val h4: TypeScale,
    val h5: TypeScale,
    val b1: TypeScale,
    val b2: TypeScale,
    val b3: TypeScale,
)

val defaultTypography = AppTypography(
    h1 = typeScale(32),
    h2 = typeScale(24),
    h3 = typeScale(17),
    h4 = typeScale(16),
    h5 = typeScale(14),
    b1 = typeScale(14),
    b2 = typeScale(12),
    b3 = typeScale(10),
)

private fun typeScale(sizeSp: Int) = TypeScale(
    regular = textStyle(sizeSp, YettelFontWeights.Regular),
    semibold = textStyle(sizeSp, YettelFontWeights.Semibold),
    bold = textStyle(sizeSp, YettelFontWeights.Bold),
)

private fun textStyle(sizeSp: Int, weight: FontWeight) = TextStyle(
    fontFamily = YettelFontFamily,
    fontWeight = weight,
    fontSize = sizeSp.sp,
)
