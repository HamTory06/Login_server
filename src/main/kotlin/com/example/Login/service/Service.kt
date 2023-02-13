package com.example.Login.service

import com.example.Login.entity.User
import com.example.Login.Repository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class Service(@Autowired private val repository: Repository) {
    fun save(user: User):User{
        return repository.save(user)
    }
}