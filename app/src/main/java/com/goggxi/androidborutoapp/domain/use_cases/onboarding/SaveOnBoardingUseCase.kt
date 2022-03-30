package com.goggxi.androidborutoapp.domain.use_cases.onboarding

import com.goggxi.androidborutoapp.data.repository.Repository

class SaveOnBoardingUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(completed: Boolean) {
        repository.saveOnBoardingState(completed = completed)
    }
}