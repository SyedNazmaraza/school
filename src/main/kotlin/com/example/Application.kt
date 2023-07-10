package com.example

import com.example.config.configureContentNegotiation
import com.example.config.configureDataBase
import com.example.config.configureKoin
import com.example.config.configureRoutes
import io.ktor.server.application.*


fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureDataBase()
    configureContentNegotiation()
    configureKoin()
    configureRoutes()

}
