package com.ott.session.manager

import android.content.Context
import com.ott.session.configs.AppConfig
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SessionManager @Inject constructor(
    @ApplicationContext context: Context,
    val appConfig: AppConfig
) {

}