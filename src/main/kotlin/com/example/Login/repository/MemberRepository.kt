package com.example.Login.repository

import com.example.Login.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface MemberRepository: JpaRepository<User,Long>{
    @Query("select m from User m where m.email = ?1")
    fun findByEmail(email: String): User
}