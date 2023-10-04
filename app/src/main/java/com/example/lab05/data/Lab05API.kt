package com.example.lab05.data

import com.example.lab05.data.dto.DepartamentosDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface Lab05API {
    @GET("objects/")
    suspend fun getObjetos(
        @Query("departmentIds") encontrar: Int
    ) : DepartamentosDTO
}