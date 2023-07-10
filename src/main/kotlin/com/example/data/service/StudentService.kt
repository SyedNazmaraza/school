package com.example.data.service

import com.example.base.BaseResponse
import com.example.routes.student.CreateStudentParams

interface StudentService {
    suspend fun registerStudent(params: CreateStudentParams) : BaseResponse<Any>
    suspend fun loginStudent(params: CreateStudentParams)
}