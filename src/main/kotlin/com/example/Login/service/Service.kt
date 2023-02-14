package com.example.Login.service

import com.example.Login.entity.UserLogin
import com.example.Login.entity.UserSingup
import com.example.Login.repository.UserLoginRepository
import com.example.Login.repository.UserSignupRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class Service(@Autowired private val userLoginRepository: UserLoginRepository,
              @Autowired private val userSignupRepository: UserSignupRepository) {
    fun saveLogin(userLogin: UserLogin):UserLogin{
        return userLoginRepository.save(userLogin)
    }
    fun saveSignup(userSingup: UserSingup):UserSingup{
        return userSignupRepository.save(userSingup)
    }
}