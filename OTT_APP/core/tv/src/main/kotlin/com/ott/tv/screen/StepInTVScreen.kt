package com.ott.tv.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.ott.common.ui.screen.ScreenState
import com.ott.design_system.AppTheme
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

@Composable
fun StepInTVScreen(
    stateFlow: Flow<ScreenState> = flowOf(ScreenState.Content()),
    loadingContent: @Composable () -> Unit = { ScreenLoadingContent() },
    errorContent: @Composable () -> Unit = { ScreenErrorContent() },
    content: @Composable () -> Unit = { ScreenContent() },
) {
    val colors = AppTheme.colorScheme
    val state by stateFlow.collectAsState(ScreenState.Loading)
    Box(modifier = Modifier.fillMaxSize().background(color = colors.body)){
        when(state){
            is ScreenState.Loading -> loadingContent()
            is ScreenState.Error -> errorContent()
            is ScreenState.Content -> content()
        }
    }
}