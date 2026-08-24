package com.ott.common.ui.screen

sealed class ScreenState {
    object Loading: ScreenState()
    data class Content(val isReady: Boolean = false): ScreenState()
    class Error(val exception: Exception, val retryable : Boolean = true): ScreenState()
}