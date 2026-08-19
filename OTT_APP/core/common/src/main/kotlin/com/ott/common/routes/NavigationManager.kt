package com.ott.common.routes

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class NavigationManager @Inject constructor(){

    private var backStack: MutableList<AppRoute>? = null

    fun navigate(route: AppRoute) {
        backStack?.add(route)
    }

    fun navigateBack(): Boolean {
        if (backStack?.size?:0  <= 1) {
            return false
        }
        backStack?.removeLastOrNull()
        return true
    }

    fun navigateToHome() {
        backStack?.clear()
        backStack?.add(HomeRoute)
    }
    fun attachBackStack(backStack: MutableList<AppRoute>) {
        this.backStack = backStack
    }

    fun navigateAndClear(route: AppRoute) {
        backStack?.clear()
        backStack?.add(route)
    }

    fun replace(route: AppRoute) {
        backStack?.removeLastOrNull()
        backStack?.add(route)
    }

    fun popTo(route: AppRoute) {
        while (
            backStack?.size?:0 > 1 &&
            backStack?.last() != route
        ) {
            backStack?.removeLastOrNull()
        }
    }

    fun currentRoute(): AppRoute? {
        return backStack?.lastOrNull() as? AppRoute
    }
}
