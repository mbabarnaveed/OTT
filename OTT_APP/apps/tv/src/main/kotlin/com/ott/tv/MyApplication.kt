package com.ott.tv

import com.ott.tv.TvApplication
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class MyApplication: TvApplication() {

    override fun onCreate() {
        super.onCreate()
    }
}