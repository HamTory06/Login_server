package com.example.Login.common

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler

class ExceptionHandler {
    @ExceptionHandler(BaseException::class)
    protected fun handleBaseExsetion(e: BaseException): ResponseEntity<BaseRes>{
        return ResponseEntity.status(e.baseResponseCode.status)
            .body(BaseRes(e.baseResponseCode.status, e.baseResponseCode.message))
    }
}