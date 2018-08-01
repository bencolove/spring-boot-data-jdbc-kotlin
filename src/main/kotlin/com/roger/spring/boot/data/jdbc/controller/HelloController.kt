package com.roger.spring.boot.data.jdbc.controller

import com.roger.spring.boot.data.jdbc.dao.ItmmeDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController{
    @Autowired
    lateinit var dao: ItmmeDao

    @GetMapping(value=["/", "/hello"])
    fun sayHello() = "Hello boy"

    @GetMapping("/product/{company}/{market}")
    fun findProducts(@PathVariable("company") company: String,
                     @PathVariable("market") market: String): List<Map<String, Any>>
    {
        return dao.getProductListByComany(company, market)
    }
}