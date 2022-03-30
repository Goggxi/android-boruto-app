package com.goggxi.androidborutoapp.domain.repository

import kotlinx.coroutines.flow.Flow

interface DataStoreOperations {
    suspend fun saveOnBoardingState(completed : Boolean)
    fun readOnBoardingState() : Flow<Boolean>
}