package com.nohelty.pickemtracker.exception

class ResourceNotFoundException (
    val id:Int,
    val resourceName:String
): RuntimeException()

{
    fun getErrorDescription():String {
        return "$resourceName with id $id not found"
    }
}