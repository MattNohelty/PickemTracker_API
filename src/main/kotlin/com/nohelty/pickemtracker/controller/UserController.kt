package com.nohelty.pickemtracker.controller

import com.nohelty.pickemtracker.domain.User
import com.nohelty.pickemtracker.exception.ResourceNotFoundException
import com.nohelty.pickemtracker.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Matt.Nohelty on 9/23/2017
 */
@RestController()
@RequestMapping("/user")
class UserController (val userRepository: UserRepository) {

    @GetMapping()
    fun getAllUsers():List<User> {
        return userRepository.getAllUsers()
    }

    @GetMapping("{id}")
    fun getUserById(@PathVariable id:Int):User {
        val user:User? = userRepository.getById(id)
        if (user != null) {
            return user
        }
        else {
            throw ResourceNotFoundException(id, "User")
        }
    }
}