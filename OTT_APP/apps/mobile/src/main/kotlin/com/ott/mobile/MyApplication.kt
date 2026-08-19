package com.ott.mobile

import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class MyApplication: MobileApplication() {

    override fun onCreate() {
        super.onCreate()
    }
}