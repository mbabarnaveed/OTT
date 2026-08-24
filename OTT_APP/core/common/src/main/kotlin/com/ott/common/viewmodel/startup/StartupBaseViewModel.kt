package com.ott.common.viewmodel.startup

import android.content.Context
import androidx.lifecycle.viewModelScope
import com.ott.common.ui.screen.ScreenState
import com.ott.common.viewmodel.GlobalPageViewModel
import com.ott.session.usecase.GetConfigUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
open class StartupBaseViewModel @Inject constructor(
    @param:ApplicationContext private val context: Context,
    private val getConfigUseCase: GetConfigUseCase,
) : GlobalPageViewModel(context = context) {

    init {
        start()
    }

    private fun start() {
        viewModelScope.launch {
            runCatching {
                runStartupSequence()
            }.onSuccess {
                _screenStateFlow.value = ScreenState.Content
            }.onFailure { throwable ->
                _screenStateFlow.value = ScreenState.Error(
                    exception = throwable as? Exception ?: Exception(throwable),
                )
            }
        }
    }

    private suspend fun runStartupSequence() {
        getConfigUseCase()
    }
}
