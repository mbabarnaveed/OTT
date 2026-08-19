package com.ott.mobile.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.ott.common.routes.DetailsRoute
import com.ott.common.routes.EntryBuilder
import com.ott.common.routes.HomeRoute
import com.ott.common.routes.PlayerRoute
import com.ott.common.routes.SearchRoute
import com.ott.common.routes.SettingsRoute
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
object MobileNavigationEntryModule {

    @Provides
    @IntoSet
    fun provideMobileEntryBuilder(): EntryBuilder = { _ ->
        entry<HomeRoute> { RoutePlaceholder() }
        entry<DetailsRoute> { RoutePlaceholder() }
        entry<SearchRoute> { RoutePlaceholder() }
        entry<SettingsRoute> { RoutePlaceholder() }
        entry<PlayerRoute> { RoutePlaceholder() }
    }
}

@Composable
private fun RoutePlaceholder() {
    Box(modifier = Modifier.fillMaxSize().background(color = Color.White))
}
