package com.ott.common.routes

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

typealias EntryBuilder = @JvmSuppressWildcards EntryProviderScope<AppRoute>.(navigationManager: NavigationManager) -> Unit

@Serializable
sealed interface AppRoute : NavKey
@Serializable
data object HomeRoute : AppRoute

@Serializable
data class DetailsRoute(
    val contentId: String
) : AppRoute

@Serializable
data object SearchRoute : AppRoute

@Serializable
data object SettingsRoute : AppRoute

@Serializable
data class PlayerRoute(
    val contentId: String
) : AppRoute
