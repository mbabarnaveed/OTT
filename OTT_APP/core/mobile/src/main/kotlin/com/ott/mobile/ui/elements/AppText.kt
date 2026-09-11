package com.ott.mobile.ui.elements

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.ott.design_system.AppTheme
import com.ott.design_system.H2Bold

enum class AppTextVariant {
    Header,
}

@Composable
fun AppText(
    text: String,
    variant: AppTextVariant,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontWeight: FontWeight = FontWeight.Bold,
    textAlign: TextAlign = TextAlign.Unspecified,
    maxLines: Int = Int.MAX_VALUE, ) {

    val palette = AppTheme.colorScheme
    val resolvedColor = if (color == Color.Unspecified) palette.light else color
    val style = when (variant) {
        AppTextVariant.Header -> H2Bold
    }

    Text(
        maxLines = maxLines,
        color= resolvedColor,
        text = text,
        modifier = modifier,
        style = style,
        textAlign = textAlign,
    )

}