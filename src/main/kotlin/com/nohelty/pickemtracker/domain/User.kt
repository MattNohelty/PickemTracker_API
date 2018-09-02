package com.nohelty.pickemtracker.domain

import com.nohelty.pickemtracker.enum.Role
import java.time.Instant

data class User (
    var id:Int?,
    val firstName:String,
    val lastName:String,
    val email:String,
    val password:String,
    var createdDate:Instant?,
    val roles: MutableList<Role> = mutableListOf(Role.player)
)