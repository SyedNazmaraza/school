package com.example.config

import com.example.data.db.DataFactory
import com.example.data.repository.StudentRepository
import com.example.data.repository.StudentRepositoryImpl
import com.example.data.service.StudentServiceImpl
import com.example.routes.student.studentRoutes
import io.ktor.serialization.gson.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import org.koin.dsl.module

import org.koin.ktor.plugin.koin

fun Application.configureRoutes(){
    studentRoutes()

}

fun configureDataBase(){
    DataFactory.init()
}
fun Application.configureContentNegotiation(){
    install(ContentNegotiation){
        gson ()
    }
}
fun Application.configureKoin(){
    val module = module {
        single<StudentRepository>{StudentRepositoryImpl()}
        single { StudentServiceImpl(get()) }
    }
    koin {
        modules(module)
    }
}

