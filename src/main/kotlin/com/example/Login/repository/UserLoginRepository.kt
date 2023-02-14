package com.example.Login.repository

import com.example.Login.entity.UserLogin
import org.springframework.data.jpa.repository.JpaRepository

interface UserLoginRepository: JpaRepository<UserLogin,Long>{

}