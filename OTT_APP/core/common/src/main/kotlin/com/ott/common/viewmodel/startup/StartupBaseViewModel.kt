package com.ott.common.viewmodel.startup

import android.content.Context
import androidx.lifecycle.viewModelScope
import com.ott.common.ui.screen.ScreenState
import com.ott.common.viewmodel.GlobalPageViewModel
import com.ott.session.configs.AppConfig
import com.ott.session.manager.SessionManager
import com.ott.session.usecase.GetStartupUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
open class StartupBaseViewModel @Inject constructor(
    @param:ApplicationContext private val context: Context,
    private val getStartupUseCase: GetStartupUseCase,
    private val sessionManager: SessionManager,
) : GlobalPageViewModel(context = context) {

    private val _appConfig = MutableStateFlow<AppConfig?>(null)
    val appConfig: StateFlow<AppConfig?> = _appConfig

    init {
        _screenStateFlow.value = ScreenState.Loading
        start()
    }

    private fun start() {
        viewModelScope.launch(Dispatchers.Default) {
            runCatching {
                getStartupUseCase()
            }.onSuccess { config ->
                _appConfig.value = sessionManager.appConfig
                _screenStateFlow.value = ScreenState.Content(isReady = true)
            }.onFailure { throwable ->
                _screenStateFlow.value = ScreenState.Error(
                    exception = throwable as? Exception ?: Exception(throwable),
                )
            }
        }
    }
}
