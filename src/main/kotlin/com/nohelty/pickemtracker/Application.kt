package com.nohelty.pickemtracker

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.scheduling.annotation.EnableScheduling

//@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
@ComponentScan
class Application {}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}