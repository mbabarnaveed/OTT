package come.ott.stb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity: ComponentActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                scrim = menuBg.toArgb(),
                darkScrim = menuBg.toArgb()
            )
        )
        setContent {
            AppRoot(intent = intent, viewModel = appViewModel)
        }*/
        setContent {
            Box(modifier = Modifier.fillMaxSize().background(color = Color.White)) { }
        }
    }
}