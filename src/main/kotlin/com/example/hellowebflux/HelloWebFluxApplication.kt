package com.example.hellowebflux;

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class HelloWebFluxApplication {

	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			SpringApplication.run(HelloWebFluxApplication::class.java, *args)
		}
	}
}
