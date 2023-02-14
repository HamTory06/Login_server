package com.example.Login.common

import org.springframework.http.HttpStatus

data class BaseRes(
    val status: HttpStatus,
    val message: String?
)
