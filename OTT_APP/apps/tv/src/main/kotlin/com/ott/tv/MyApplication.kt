package com.ott.tv

import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication: TvApplication() {

    override fun onCreate() {
        super.onCreate()
    }
}
