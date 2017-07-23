package com.example.hellowebflux

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router

@Configuration
open class HealthCheckRoute(private val helloHandler: HelloHandler) {

    @Bean
    open fun healthCheckRouter() = router {
        GET("/", helloHandler::hello)
        GET("/json", helloHandler::helloJson)
    }
}