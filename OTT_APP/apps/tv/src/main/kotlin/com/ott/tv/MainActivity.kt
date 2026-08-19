package com.ott.tv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ott.common.routes.EntryBuilder
import com.ott.common.routes.NavigationManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity: ComponentActivity()  {

    @Inject
    lateinit var entryBuilders: Set<EntryBuilder>

    @Inject
    lateinit var navigationManager: NavigationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppRoot(
                intent = intent,
                entryBuilders = entryBuilders,
                navigationManager = navigationManager
            )
        }
    }
}
