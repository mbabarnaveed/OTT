package come.ott.stb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.ott.common.routes.EntryBuilder
import com.ott.common.routes.NavigationManager
import com.ott.stb.AppRoot
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
                entryBuilders=entryBuilders,
                navigationManager = navigationManager
            )
        }
    }
}