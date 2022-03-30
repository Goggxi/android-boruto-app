package com.goggxi.androidborutoapp.domain.use_cases

import com.goggxi.androidborutoapp.domain.use_cases.onboarding.ReadOnBoardingUseCase
import com.goggxi.androidborutoapp.domain.use_cases.onboarding.SaveOnBoardingUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
)
