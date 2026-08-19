package com.ott.common.routes

import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey

class NavigationManager(
    private val backStack: NavBackStack<NavKey>
) {
    fun navigate(route: AppRoute) {
        backStack.add(route)
    }

    fun navigateBack(): Boolean {
        if (backStack.size <= 1) {
            return false
        }
        backStack.removeLastOrNull()
        return true
    }

    fun navigateToHome() {
        backStack.clear()
        backStack.add(HomeRoute)
    }

    fun navigateAndClear(route: AppRoute) {
        backStack.clear()
        backStack.add(route)
    }

    fun replace(route: AppRoute) {
        backStack.removeLastOrNull()
        backStack.add(route)
    }

    fun popTo(route: AppRoute) {
        while (
            backStack.size > 1 &&
            backStack.last() != route
        ) {
            backStack.removeLastOrNull()
        }
    }

    fun currentRoute(): AppRoute? {
        return backStack.lastOrNull() as? AppRoute
    }
}
