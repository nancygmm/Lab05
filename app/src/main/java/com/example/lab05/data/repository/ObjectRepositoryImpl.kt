package com.example.lab05.data.repository

import com.example.lab05.data.Lab05API
import com.example.lab05.data.Result
import com.example.lab05.data.dto.toID
import com.example.lab05.domain.model.Object
import com.example.lab05.domain.repository.ObjectRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import javax.inject.Inject

class ObjectRepositoryImpl @Inject constructor(
    private val api: Lab05API
): ObjectRepository {

    override fun getObject(encontrar: Int): Flow<Result<List<Object>>> = flow{
        emit(Result.Loading())
        try {
            val response = api.getObjetos(encontrar).toID()
            emit(Result.Success(response))
        } catch (e: HttpException) {
                emit(Result.Error(
                mensaje = "Error"
            )
        }
    }

}