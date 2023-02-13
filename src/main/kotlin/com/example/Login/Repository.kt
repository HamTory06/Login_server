package com.example.Login

import com.example.Login.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface Repository: JpaRepository<User,Long>{

}