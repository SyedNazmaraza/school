package com.example.base

import com.google.gson.annotations.Expose
import io.ktor.http.*
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
@Serializable
sealed class BaseResponse<T>(){
    @Serializable
    data class SuccessResponse<T>(

        val data : T?,
        val message:String,
        @Contextual
         val statusCode: HttpStatusCode = HttpStatusCode.Created
    ):BaseResponse<T>()

    @Serializable
    data class ErrorResponse<T>(
        val message:String,
        @Contextual
        val statusCode: HttpStatusCode = HttpStatusCode.BadRequest
    ):BaseResponse<T>()
}
