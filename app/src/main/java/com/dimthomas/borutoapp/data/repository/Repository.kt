package com.dimthomas.borutoapp.data.repository

import com.dimthomas.borutoapp.domain.repository.DataStoreOperations
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val datastore: DataStoreOperations
) {

    suspend fun saveOnBoardingState(completed: Boolean) {
        datastore.saveOnboardingState(completed = completed)
    }

    fun readOnBoardingState(): Flow<Boolean> {
        return datastore.readOnBoardingState()
    }
}