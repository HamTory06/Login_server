package com.example.Login.controller


import com.example.Login.LoginRequest
import com.example.Login.SignupRequest
import com.example.Login.service.MemberService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
@RestController
class Controller(private val memberService: MemberService) {

    @PostMapping("/login")
    fun login(@RequestBody loginRequest: LoginRequest): ResponseEntity<Any> {
        return memberService.login(loginRequest.email,loginRequest.password)
    }

    @PostMapping("/signup")
    fun signup(@RequestBody signupRequest: SignupRequest): ResponseEntity<Any> {
        return memberService.join(signupRequest.email,signupRequest.password,signupRequest.name)
    }

}