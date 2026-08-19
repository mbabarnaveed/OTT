package com.ott.mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.rememberNavBackStack
import com.ott.common.routes.AppRoute
import com.ott.common.routes.HomeRoute
import com.ott.common.routes.NavigationManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity  : ComponentActivity() {

    @Inject
    lateinit var navigationManager: NavigationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge(
            /*statusBarStyle = SystemBarStyle.light(
                scrim = menuBg.toArgb(),
                darkScrim = menuBg.toArgb()
            )*/
        )
        setContent {
            val backStack = remember { mutableStateListOf<AppRoute>(HomeRoute) }
          //  val backStack = rememberNavBackStack(HomeRoute)
            val navigationManager = remember(backStack) { NavigationManager(backStack) }
            AppRoot(intent = intent)
        }
    }
}