package ott.tv.startup

import com.ott.common.routes.EntryBuilder
import com.ott.common.routes.StartUpRoute
import com.ott.tv.TVComposeScreen
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
object FeatureStartUpModule {
    @Provides
    @IntoSet
    fun provideStartUpEntryBuilder(): EntryBuilder = { _ ->
        entry<StartUpRoute> {
            TVComposeScreen()
        }
    }
}
