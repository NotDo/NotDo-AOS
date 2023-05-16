package com.notdo.util_network

sealed class ApiState<T>(
    val data: T? = null,
    val message: String? = null,
    val status: Int? = null
) {
    class Success<T>(data: T, status: Int) : ApiState<T>(data, status = status)
    class Error<T>(message: String, data: T? = null, status: Int) : ApiState<T>(data, message, status)
    class Loading<T> : ApiState<T>()
}