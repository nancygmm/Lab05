package com.example.lab05.domain.repository

import com.example.lab05.data.Result
import com.example.lab05.domain.model.Object
import kotlinx.coroutines.flow.Flow

interface ObjectRepository {
    fun getObject(encontrar: Int): Flow<Result<List<Object>>>

}