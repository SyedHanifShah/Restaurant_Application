package com.corn.cornpos.di

import com.corn.cornpos.repository.CornPosRepository
import com.corn.cornpos.repository.CornPosRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton


@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

        @Binds
        @Singleton
        abstract fun cornPosRepository(
            beStarRepositoryImpl: CornPosRepositoryImpl
        ): CornPosRepository


}