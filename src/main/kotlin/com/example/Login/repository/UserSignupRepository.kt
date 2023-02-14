package com.example.Login.repository

import com.example.Login.entity.UserSingup
import org.springframework.data.jpa.repository.JpaRepository

interface UserSignupRepository:JpaRepository<UserSingup,Long> {

}