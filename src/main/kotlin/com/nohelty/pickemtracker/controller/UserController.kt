package com.nohelty.pickemtracker.controller

import com.nohelty.pickemtracker.domain.User
import com.nohelty.pickemtracker.exception.ResourceNotFoundException
import com.nohelty.pickemtracker.repository.UserRepository
import org.springframework.web.bind.annotation.*

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

    @PostMapping
    fun createUser(@RequestBody user:User) {
        userRepository.createUser(user)
    }

    @PutMapping("{id}")
    fun updateUser(@RequestBody user:User) {
        userRepository.updateUser(user)
    }
}