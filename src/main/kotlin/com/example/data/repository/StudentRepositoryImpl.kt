package com.example.data.repository

import com.example.data.db.DataFactory.dbQuery
import com.example.data.db.schemas.StudentTable
import com.example.data.extensions.toStudent
import com.example.data.model.Student
import com.example.routes.student.CreateStudentParams
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.statements.InsertStatement
import java.time.LocalDateTime

class StudentRepositoryImpl() : StudentRepository {
    override suspend fun register(params: CreateStudentParams): Student? {
        var statement : InsertStatement<Number>? = null
        dbQuery{
            statement = StudentTable.insert {
                it[name] = params.name
                it[email] = params.email
                it[pass] = params.password
                it[branch] = params.branch
                it[joiningDate] = LocalDateTime.now()
            }
        }
        return statement?.resultedValues?.get(0).toStudent();
    }
}