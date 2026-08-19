package com.ott.stb

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.ott.common.routes.AppRoute
import com.ott.common.routes.EntryBuilder
import com.ott.common.routes.HomeRoute
import com.ott.common.routes.NavigationManager

@Composable
fun AppRoot(
    intent: Intent,
    navigationManager:NavigationManager,
    entryBuilders: Set<EntryBuilder>
) {
    val backStack = remember { mutableStateListOf<AppRoute>(HomeRoute) }

    LaunchedEffect(backStack) {
        navigationManager.attachBackStack(backStack)
    }

    NavDisplay(
        backStack = backStack,
        modifier = Modifier.fillMaxSize(),
        onBack = { navigationManager.navigateBack() },
        entryProvider = entryProvider {
            entryBuilders.forEach { it(navigationManager) }
        }
    )
}

@Composable
private fun RouteContent() {
    Box(modifier = Modifier.fillMaxSize().background(color = Color.White))
}
