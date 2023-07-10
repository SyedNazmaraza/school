package com.example.data.service

import com.example.base.BaseResponse
import com.example.data.model.Student
import com.example.data.repository.StudentRepository
import com.example.data.repository.StudentRepositoryImpl
import com.example.routes.student.CreateStudentParams

class StudentServiceImpl(val repo : StudentRepository) : StudentService {
    override suspend fun registerStudent(params: CreateStudentParams): BaseResponse<Any> {
        val student = repo.register(params)
        return if(student!=null) BaseResponse.SuccessResponse(data = student, message = "Registerd Successfully ")
        else BaseResponse.ErrorResponse(message = "Not Registerd ")
    }

    override suspend fun loginStudent(params: CreateStudentParams) {
        TODO("Not yet implemented")
    }
}