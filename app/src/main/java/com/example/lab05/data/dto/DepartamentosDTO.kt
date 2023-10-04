package com.example.lab05.data.dto

import com.example.lab05.domain.model.Object

data class DepartamentosDTO(
    val objectIDs: List<Int>,
    val total: Int,
)

fun DepartamentosDTO.toID(): Object {
    return Object (
        objectIDs = objectIDs,
        total =total
            )
}