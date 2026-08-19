package com.ott.common.viewmodel.startup

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
open class StartupBaseViewModel @Inject constructor(): ViewModel() {
}