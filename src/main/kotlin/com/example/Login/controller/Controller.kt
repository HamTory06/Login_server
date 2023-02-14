package com.example.Login.controller


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
@RestController
class Controller {

    @PostMapping("/login")
    fun login(): ResponseEntity<Any> {
        return ResponseEntity.ok().body(null)
    }

    @PostMapping("/signup")
    fun signup(): ResponseEntity<Any> {
        return ResponseEntity.ok().body(null)
    }

}