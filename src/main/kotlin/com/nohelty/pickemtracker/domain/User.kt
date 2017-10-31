package com.nohelty.pickemtracker.domain

import java.time.Instant

/**
 * Created by Matt.Nohelty on 9/23/2017
 */
data class User (
    var id:Int?,
    val firstName:String,
    val lastName:String,
    val email:String,
    val createdDate:Instant
)