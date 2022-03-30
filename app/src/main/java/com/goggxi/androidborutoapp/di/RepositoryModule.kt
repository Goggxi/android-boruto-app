package com.goggxi.androidborutoapp.di

import android.content.Context
import com.goggxi.androidborutoapp.data.repository.DataStoreOperationsImpl
import com.goggxi.androidborutoapp.data.repository.Repository
import com.goggxi.androidborutoapp.domain.repository.DataStoreOperations
import com.goggxi.androidborutoapp.domain.use_cases.UseCases
import com.goggxi.androidborutoapp.domain.use_cases.onboarding.ReadOnBoardingUseCase
import com.goggxi.androidborutoapp.domain.use_cases.onboarding.SaveOnBoardingUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperations(
        @ApplicationContext context: Context
    ): DataStoreOperations {
        return DataStoreOperationsImpl(context = context)
    }


    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): UseCases {
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository)
        )
    }


}