package com.nohelty.pickemtracker.exception

/**
 * Created by Matt.Nohelty on 9/23/2017
 */

class ResourceNotFoundException (
    val id:Int,
    val resourceName:String
): RuntimeException()

{
    fun getErrorDescription():String {
        return "$resourceName with id $id not found"
    }
}