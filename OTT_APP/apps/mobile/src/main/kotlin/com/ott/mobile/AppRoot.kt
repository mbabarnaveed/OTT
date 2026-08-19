package com.ott.mobile

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.ott.common.routes.DetailsRoute
import com.ott.common.routes.HomeRoute
import com.ott.common.routes.NavigationManager
import com.ott.common.routes.PlayerRoute
import com.ott.common.routes.SearchRoute
import com.ott.common.routes.SettingsRoute

@Composable
fun AppRoot(intent: Intent) {
    val backStack = rememberNavBackStack(HomeRoute)
    val navigationManager = remember(backStack) { NavigationManager(backStack) }

    NavDisplay(
        backStack = backStack,
        modifier = Modifier.fillMaxSize(),
        onBack = { navigationManager.navigateBack() },
        entryProvider = entryProvider {
            entry<HomeRoute> {
                RouteContent()
            }
            entry<DetailsRoute> {
                RouteContent()
            }
            entry<SearchRoute> {
                RouteContent()
            }
            entry<SettingsRoute> {
                RouteContent()
            }
            entry<PlayerRoute> {
                RouteContent()
            }
        }
    )
}

@Composable
private fun RouteContent() {
    Box(modifier = Modifier.fillMaxSize().background(color = Color.White))
}
