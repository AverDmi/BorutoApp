package com.dimthomas.borutoapp.domain.repository

import kotlinx.coroutines.flow.Flow

interface DataStoreOperations {

    suspend fun saveOnboardingState(completed: Boolean)

    fun readOnBoardingState(): Flow<Boolean>
}