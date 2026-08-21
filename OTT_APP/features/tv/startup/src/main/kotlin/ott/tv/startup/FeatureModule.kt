package ott.tv.startup

import androidx.hilt.navigation.compose.hiltViewModel
import com.ott.common.routes.EntryBuilder
import com.ott.common.routes.StartUpRoute
import com.ott.common.viewmodel.startup.StartupBaseViewModel
import com.ott.tv.screen.StepInTVScreen
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import ott.tv.startup.screen.SplashScreen

@Module
@InstallIn(SingletonComponent::class)
object FeatureStartUpModule {
    @Provides
    @IntoSet
    fun provideStartUpEntryBuilder(): EntryBuilder = { _ ->
        entry<StartUpRoute> {
            val viewModel = hiltViewModel<StartupBaseViewModel>()
            StepInTVScreen(
                stateFlow = viewModel.screenStateFlow,
                content = {
                    SplashScreen()
                }
            )
        }
    }
}
