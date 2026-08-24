package ott.mobile.startup.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ott.common.ui.screen.ScreenState
import com.ott.common.viewmodel.startup.StartupBaseViewModel


@Composable
fun SplashScreen(
    viewModel: StartupBaseViewModel,
) {
    val state by viewModel.screenStateFlow.collectAsState(ScreenState.Content())
    val config by viewModel.appConfig.collectAsState()
    val isReady = (state as? ScreenState.Content)?.isReady == true

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        if (isReady && config != null) {
            Column {
                Text("forceUpdate: ${config?.forceUpdate}")
                Text("version: ${config?.version}")
                Text("country: ${config?.country}")
                Text("baseLang: ${config?.baseLang}")
                Text("tenantId: ${config?.tenantId}")
                Text("translation_url: ${config?.translation_url}")
                Text("languages: ${config?.languages}")
            }
        }
    }
}
