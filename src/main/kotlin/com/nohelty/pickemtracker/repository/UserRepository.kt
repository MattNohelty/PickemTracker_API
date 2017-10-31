package com.nohelty.pickemtracker.repository

import com.nohelty.pickemtracker.domain.User
import org.springframework.stereotype.Repository
import java.time.Instant

/**
 * Created by Matt.Nohelty on 9/23/2017
 */
@Repository
class UserRepository {

    /**
     * Get all users
     */
    fun getAllUsers():List<User> {
        val user1 = User(1, "Matt", "Nohelty", "nolt2232@gmail.com", Instant.now())

        return listOf(user1)
    }

    /**
     * Get users by id
     * @param id - user id
     */
    fun getById(id:Int):User? {
        if (id == 1) {
            return User(1, "Matt", "Nohelty", "nolt2232@gmail.com", Instant.now())
        }
        else {
            return null
        }
    }

}