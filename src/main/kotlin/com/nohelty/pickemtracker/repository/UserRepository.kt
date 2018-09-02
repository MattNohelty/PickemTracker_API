package com.nohelty.pickemtracker.repository

import com.nohelty.pickemtracker.domain.User
import com.nohelty.pickemtracker.enum.Role
import org.springframework.stereotype.Repository
import java.time.Instant

@Repository
class UserRepository {

    /**
     * Get all users
     */
    fun getAllUsers():List<User> {
        val user1 = User(1, "Matt", "Nohelty", "matt.nohelty@gmail.com", "password123", Instant.now(), mutableListOf(Role.player))

        return listOf(user1)
    }

    /**
     * Get users by id
     * @param id - user id
     */
    fun getById(id:Int):User? {
        if (id == 1) {
            return User(1, "Matt", "Nohelty", "matt.nohelty@gmail.com", "password123", Instant.now(), mutableListOf(Role.player))
        }
        else {
            return null
        }
    }

    /**
     * Get users by email
     * @param email - user's email address
     */
    fun getByEmail(email:String):User? {
        if (email.equals("matt.nohelty@gmail.com")) {
            return User(1, "Matt", "Nohelty", "matt.nohelty@gmail.com", "password123", Instant.now(), mutableListOf(Role.player))
        }
        else {
            return null
        }
    }


    /**
     * Update a user
     * @param user - user
     */
    fun createUser(user:User) : User {
        user.createdDate = Instant.now()
        print("create user")
        user.id = 100
        return user
    }

    /**
     * Update a user
     * @param user - user
     */
    fun updateUser(user:User) {
        print("update user")
    }
}