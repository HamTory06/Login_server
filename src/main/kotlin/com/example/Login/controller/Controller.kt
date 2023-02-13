package com.example.Login.controller

import com.example.Login.entity.User
import com.example.Login.service.Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(@Autowired private val service: Service) {
    @PostMapping("/login")
    fun save(@RequestBody user: User):User{
        return service.save(user)
    }
}