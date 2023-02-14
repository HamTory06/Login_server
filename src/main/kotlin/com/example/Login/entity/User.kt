package com.example.Login.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.NoArgsConstructor
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDate
import java.time.LocalDateTime


@Entity
class User (
    var email: String,
    var password: String
) {
    @Id
    @GeneratedValue
    var id: Long ?= null

    @CreationTimestamp
    var createdAt: LocalDateTime = LocalDateTime.now()

    fun checkPassword(input_password:String): Boolean{
        return (password == input_password)
    }
}