package com.ott.common.ui.screen

sealed class ScreenState {
    object Loading: ScreenState()
    object Content: ScreenState()
    class Error(val exception: Exception, val retryable : Boolean = true): ScreenState()
}