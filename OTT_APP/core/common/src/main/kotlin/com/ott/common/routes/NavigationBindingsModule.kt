package com.ott.common.routes

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.Multibinds

@Module
@InstallIn(SingletonComponent::class)
abstract class NavigationBindingsModule {

    @Multibinds
    abstract fun entryBuilders(): Set<EntryBuilder>
}
