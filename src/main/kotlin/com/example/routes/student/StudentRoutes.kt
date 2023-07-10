package com.example.routes.student

import com.example.data.service.StudentService
import com.example.data.service.StudentServiceImpl
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.studentRoutes(){
    val service by inject<StudentServiceImpl>()
    routing {
        route("/student"){
            post ("/register"){
                var params = call.receive<CreateStudentParams>()
                call.respond(service.registerStudent(params))

            }
        }
    }
}