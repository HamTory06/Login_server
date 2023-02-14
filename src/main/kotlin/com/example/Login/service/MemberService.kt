package com.example.Login.service

import com.example.Login.common.BaseException
import com.example.Login.common.BaseResponseCode
import com.example.Login.entity.User
import com.example.Login.repository.MemberRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository
) {
    fun login(email: String, password: String): ResponseEntity<Any>{
        val user: User = memberRepository.findByEmail(email)
        user ?: throw BaseException(BaseResponseCode.USER_NOT_FOUND)

        if(!user.checkPassword(password)){
            throw BaseException(BaseResponseCode.INVALID_PASSWORD)
        }
        return ResponseEntity.ok().body(user)
    }

    fun join(email: String, password: String, name: String): ResponseEntity<Any>{
        if (memberRepository.findByEmail(email) != null)
            throw BaseException(BaseResponseCode.DUPLICATE_USER)
        return ResponseEntity.ok().body(memberRepository.save(User(email, password, name)))
    }
}