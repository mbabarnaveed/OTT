package com.ott.common.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.ott.common.ui.screen.ScreenState
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
open class GlobalPageViewModel @Inject constructor(
    @param:ApplicationContext private val context: Context,
): ViewModel(){
    protected val _screenStateFlow = MutableStateFlow<ScreenState>(ScreenState.Loading)
    val screenStateFlow: Flow<ScreenState> = _screenStateFlow
}