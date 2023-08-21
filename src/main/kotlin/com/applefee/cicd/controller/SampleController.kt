package com.applefee.cicd.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/test")
class SampleController {

    @GetMapping
    suspend fun get(): Map<String, String> {
        println("[CI/CD] v1/test API Request.")
        return mapOf("deployStatus" to "SUCCESS")
    }
}