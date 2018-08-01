package com.roger.spring.boot.data.jdbc.dao

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Component

@Component
class ItmmeDao{
    @Autowired
    private lateinit var jdbcTemplate: NamedParameterJdbcTemplate

    fun getProductListByComany(company: String, market: String): List<Map<String, Any>>{
        val sql = """
            select * from itmmh where tenantno=:company and mh018=:market
        """.trimIndent()

        val params = mapOf(Pair("company", company), Pair("market", market))

        return jdbcTemplate.queryForList(sql , params)
    }
}