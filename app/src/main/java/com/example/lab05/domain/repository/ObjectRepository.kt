package com.example.lab05.domain.repository

import com.example.lab05.data.Result
import com.example.lab05.domain.model.Object
import com.example.lab05.domain.model.Objects
import kotlinx.coroutines.flow.Flow

interface ObjectRepository {
    fun getObjects(page: Int): Flow<Result<List<Objects>>>

    suspend fun getObject(id: Int): Result<Object>
}