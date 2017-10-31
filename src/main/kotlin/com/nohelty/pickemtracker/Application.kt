package com.nohelty.pickemtracker

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.scheduling.annotation.EnableScheduling

/**
 * Created by Matt.Nohelty on 9/23/2017
 */
//@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
@ComponentScan
class Application {}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}