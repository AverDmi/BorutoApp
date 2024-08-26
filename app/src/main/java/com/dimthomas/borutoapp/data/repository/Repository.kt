package com.dimthomas.borutoapp.data.repository

import androidx.paging.PagingData
import com.dimthomas.borutoapp.domain.model.Hero
import com.dimthomas.borutoapp.domain.repository.DataStoreOperations
import com.dimthomas.borutoapp.domain.repository.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val remote: RemoteDataSource,
    private val datastore: DataStoreOperations
) {

    fun getAllHeroes(): Flow<PagingData<Hero>> {
        return  remote.getAllHeroes()
    }

    suspend fun saveOnBoardingState(completed: Boolean) {
        datastore.saveOnboardingState(completed = completed)
    }

    fun readOnBoardingState(): Flow<Boolean> {
        return datastore.readOnBoardingState()
    }
}