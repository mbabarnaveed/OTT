package ott.mobile.startup

import androidx.hilt.navigation.compose.hiltViewModel
import com.ott.common.routes.EntryBuilder
import com.ott.common.routes.StartUpRoute
import com.ott.common.viewmodel.startup.StartupBaseViewModel
import com.ott.mobile.screen.StepInMobileScreen
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import ott.mobile.startup.screen.SplashScreen

@Module
@InstallIn(SingletonComponent::class)
object FeatureStartUpModule {
    @Provides
    @IntoSet
    fun provideStartUpEntryBuilder(): EntryBuilder = { _ ->
        entry<StartUpRoute> {
            val viewModel = hiltViewModel<StartupBaseViewModel>()
            StepInMobileScreen(
                stateFlow = viewModel.screenStateFlow,
                content = {
                    SplashScreen()
                }
            )
        }
    }
}
