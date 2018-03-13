package com.boot.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class BootExampleApplication {

    companion object {
        @JvmStatic
        fun main(args :Array<String>) {
            SpringApplication.run(BootExampleApplication::class.java, *args)
        }
    }
}