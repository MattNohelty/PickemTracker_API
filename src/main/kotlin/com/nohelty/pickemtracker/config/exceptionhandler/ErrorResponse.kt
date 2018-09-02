package com.nohelty.pickemtracker.config.exceptionhandler

import org.springframework.http.HttpStatus

class ErrorResponse(status: HttpStatus, val errorDescription: String) {

    val error:String

    init {
        this.error = status.name
    }

}