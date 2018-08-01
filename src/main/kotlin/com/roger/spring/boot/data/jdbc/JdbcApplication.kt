package com.roger.spring.boot.data.jdbc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JdbcApplication

fun main(args: Array<String>) {
    runApplication<JdbcApplication>(*args)
}
