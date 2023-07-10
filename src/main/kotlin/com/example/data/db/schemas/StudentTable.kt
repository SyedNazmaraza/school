package com.example.data.db.schemas

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.javatime.datetime
import java.time.LocalDateTime

object StudentTable:Table("student") {
    val id = integer("id").autoIncrement()
    val name = varchar("name",256)
    val email = varchar("email",256)
    val pass = varchar("password",256)
    val branch = varchar("branch",256)
    val joiningDate =datetime("joining_at")

    override val primaryKey: PrimaryKey = PrimaryKey(id)
}