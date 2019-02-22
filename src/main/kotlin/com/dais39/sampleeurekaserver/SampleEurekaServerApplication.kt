package com.dais39.sampleeurekaserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class SampleEurekaServerApplication

fun main(args: Array<String>) {
    runApplication<SampleEurekaServerApplication>(*args)
}
