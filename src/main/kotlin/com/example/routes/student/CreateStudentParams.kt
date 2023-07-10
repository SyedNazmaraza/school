package com.example.routes.student

import kotlinx.serialization.Serializable

@Serializable
data class CreateStudentParams (
    val name : String,
    val email : String,
    val password : String,
    val branch : String
)