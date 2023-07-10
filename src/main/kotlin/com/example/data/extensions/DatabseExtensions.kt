package com.example.data.extensions

import com.example.data.db.schemas.StudentTable
import com.example.data.model.Student
import org.jetbrains.exposed.sql.ResultRow

fun ResultRow?.toStudent():Student?{
    return if (this==null) null
    else Student(
        name = this[StudentTable.name],
        email = this[StudentTable.email],
        pass = this[StudentTable.pass]
    )
}