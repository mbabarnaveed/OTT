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
import com.ott.mobile.device.LocalDeviceFormFactor
import com.ott.mobile.ui.elements.AppText
import com.ott.mobile.ui.elements.AppTextVariant


@Composable
fun SplashScreen(
    viewModel: StartupBaseViewModel,
) {
    val state by viewModel.screenStateFlow.collectAsState(ScreenState.Content())
    val config by viewModel.appConfig.collectAsState()
    val device = LocalDeviceFormFactor.current
    val isReady = (state as? ScreenState.Content)?.isReady == true

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        if (isReady && config != null) {
            Column {
                AppText(text = "forceUpdate: ${config?.forceUpdate}", variant = AppTextVariant.Header)
                AppText(text ="forceUpdate: ${config?.forceUpdate}", variant =AppTextVariant.Header)
                AppText(text ="version: ${config?.version}", variant =AppTextVariant.Header)
                AppText(text ="country: ${config?.country}", variant =AppTextVariant.Header)
                AppText(text ="baseLang: ${config?.baseLang}", variant =AppTextVariant.Header)
                AppText(text ="tenantId: ${config?.tenantId}", variant =AppTextVariant.Header)
                AppText(text ="translation_url: ${config?.translation_url}", variant =AppTextVariant.Header)
                AppText(text ="languages: ${config?.languages}", variant =AppTextVariant.Header)
                AppText(text ="isPortrait: ${device.isPortrait}", variant =AppTextVariant.Header)
                AppText(text ="isLandscape: ${device.isLandscape}", variant =AppTextVariant.Header)
                AppText(text ="isMobile: ${device.isMobile}", variant =AppTextVariant.Header)
                AppText(text ="isTablet: ${device.isTablet}", variant =AppTextVariant.Header)
                AppText(text ="isFoldable: ${device.isFoldable}", variant =AppTextVariant.Header)
                if (device.isFoldOpen) {
                    AppText(text ="isFoldOpen: ${device.isFoldOpen}", variant =AppTextVariant.Header)
                    AppText(text ="foldableState: open", variant =AppTextVariant.Header)
                }
            }
        }
    }
}
