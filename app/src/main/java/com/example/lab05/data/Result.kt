package com.example.lab05.data

sealed class Result<T>(val data:T? = null, val mensaje: String? = null){
    class Loading<T>(data:T? = null): Result<T>(data)
    class Success<T>(data:T?): Result<T>(data)
    class Error<T>(mensaje: String, data: T? = null): Result<T>(data, mensaje)
}
