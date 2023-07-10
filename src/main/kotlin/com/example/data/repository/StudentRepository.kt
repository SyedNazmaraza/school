package com.example.data.repository

import com.example.data.model.Student
import com.example.routes.student.CreateStudentParams

interface StudentRepository {
    suspend fun register(params: CreateStudentParams):Student?
}