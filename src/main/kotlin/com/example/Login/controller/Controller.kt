package com.example.Login.controller

import com.example.Login.entity.UserLogin
import com.example.Login.entity.UserSingup
import com.example.Login.service.Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
@RestController
class Controller(@Autowired private val service: Service) {

    @PostMapping("/login")
    fun login(@RequestBody userLogin: UserLogin):UserLogin{
        return service.saveLogin(userLogin)
    }
    @PostMapping("/signup")
    fun signup(@RequestBody userSingup: UserSingup):UserSingup {
        return service.saveSignup(userSingup)
    }

}