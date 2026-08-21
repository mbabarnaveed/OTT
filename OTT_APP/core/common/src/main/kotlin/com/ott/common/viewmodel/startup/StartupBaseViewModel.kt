package com.ott.common.viewmodel.startup

import android.content.Context
import com.ott.common.viewmodel.GlobalPageViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
open class StartupBaseViewModel @Inject constructor(
    @param:ApplicationContext private val context: Context,
): GlobalPageViewModel(context=context) {

}