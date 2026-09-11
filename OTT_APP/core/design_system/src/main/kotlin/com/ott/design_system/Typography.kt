package com.ott.design_system

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import ott.core.designsystem.R


@Stable
@get:ReadOnlyComposable
val yettelB1
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W400,
        fontSize = dimensionResource(id = R.dimen.b1).value.sp,
        letterSpacing = 0.3.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

@Stable
@get:ReadOnlyComposable
val yettelB2
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W400,
        fontSize = dimensionResource(id = R.dimen.b2).value.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.3.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

@Stable
@get:ReadOnlyComposable
val yettelH1
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W400,
        fontSize = dimensionResource(id = R.dimen.h1).value.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Bottom,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

@Stable
@get:ReadOnlyComposable
val yettelH2
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W400,
        fontSize = dimensionResource(id = R.dimen.h2).value.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Bottom,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

@Stable
@get:ReadOnlyComposable
val yettelH3
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W400,
        fontSize = dimensionResource(id = R.dimen.h3).value.sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

@Stable
@get:ReadOnlyComposable
val yettelB3
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W400,
        fontSize = dimensionResource(id = R.dimen.b3).value.sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        ),
        lineHeight = 12.sp,
        letterSpacing = 0.4.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.LastLineBottom,
        )
    )

@Stable
@get:ReadOnlyComposable
val yettelB4
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W400,
        fontSize = dimensionResource(id = R.dimen.b4).value.sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        ),
        lineHeight = 12.sp,
        letterSpacing = 0.4.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.LastLineBottom,
        )
    )

@Stable
@get:ReadOnlyComposable
val yettelB3Light
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W300,
        fontSize = dimensionResource(id = R.dimen.b3).value.sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        ),
        lineHeight = 12.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.LastLineBottom,
        )
    )

@Stable
@get:ReadOnlyComposable
val yettelH4
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W400,
        fontSize = dimensionResource(id = R.dimen.h4).value.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Bottom,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )


@Stable
@get:ReadOnlyComposable
val yettelB1Bold
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W700,
        fontSize = dimensionResource(id = R.dimen.b1).value.sp,
        letterSpacing = 0.3.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.None,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

@Stable
@get:ReadOnlyComposable
val yettelB2Bold
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W700,
        fontSize = dimensionResource(id = R.dimen.b2).value.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.3.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.None,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

@Stable
@get:ReadOnlyComposable
val yettelB4Bold
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W700,
        fontSize = dimensionResource(id = R.dimen.b4).value.sp,
        letterSpacing = 0.3.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

@Stable
@get:ReadOnlyComposable
val yettelB4BoldUnderLine
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W700,
        fontSize = dimensionResource(id = R.dimen.b4).value.sp,
        letterSpacing = 0.3.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        ),
        textDecoration = TextDecoration.Underline
    )

@Stable
@get:ReadOnlyComposable
val yettelB3Bold
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W600,
        fontSize = dimensionResource(id = R.dimen.b3).value.sp,
        letterSpacing = 0.3.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

@Stable
@get:ReadOnlyComposable
val H2Bold
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W700,
        fontSize = dimensionResource(id = R.dimen.h2).value.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Bottom,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

@Stable
@get:ReadOnlyComposable
val yettelH3Bold
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W700,
        fontSize = dimensionResource(id = R.dimen.h3).value.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Bottom,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

@Stable
@get:ReadOnlyComposable
val yettelH4Bold
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W700,
        fontSize = dimensionResource(id = R.dimen.h4).value.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Bottom,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

@Stable
@get:ReadOnlyComposable
val yettelB1Light
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W300,
        fontSize = dimensionResource(id = R.dimen.b1).value.sp,
        letterSpacing = 0.3.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        ),
    )

@Stable
@get:ReadOnlyComposable
val yettelB2Light
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W300,
        fontSize = dimensionResource(id = R.dimen.b2).value.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.3.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

@Stable
@get:ReadOnlyComposable
val yettelB4Light
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W300,
        fontSize = dimensionResource(id = R.dimen.b4).value.sp,
        letterSpacing = 0.3.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

@Stable
@get:ReadOnlyComposable
val yettelB4RegularUnderLine
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W400,
        fontSize = dimensionResource(id = R.dimen.b4).value.sp,
        letterSpacing = 0.3.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        ),
        textDecoration = TextDecoration.Underline
    )

@Stable
@get:ReadOnlyComposable
val yettelH4Light
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W300,
        fontSize = dimensionResource(id = R.dimen.h4).value.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

@get:ReadOnlyComposable
val yettelH3Light
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W300,
        fontSize = dimensionResource(id = R.dimen.h3).value.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

@Stable
@get:ReadOnlyComposable
val yettelH2Light
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W300,
        fontSize = dimensionResource(id = R.dimen.h2).value.sp,
        lineHeight = 28.8.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

@Stable
@get:ReadOnlyComposable
val menuTextStyle
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W300,
        fontSize = dimensionResource(id = R.dimen.h2).value.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )
@Stable
@get:ReadOnlyComposable
val yettelH1Light
    @Composable get() = TextStyle(
        fontFamily = AppTheme.fontScheme,
        fontWeight = FontWeight.W300,
        fontSize = dimensionResource(id = R.dimen.h1).value.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.LastLineBottom,
        ),
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )

