package com.example.Login.common

import org.springframework.http.HttpStatus

enum class BaseResponseCode(status: HttpStatus, message: String){
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "사용자를 찾을 수 없습니다."),
    INVALID_PASSWORD(HttpStatus.BAD_REQUEST, "잘못된 비밀번호입니다."),
    DUPLICATE_USER(HttpStatus.BAD_REQUEST, "중복된 사용자 입니다.");

    val status: HttpStatus = status
    val message: String = message
}