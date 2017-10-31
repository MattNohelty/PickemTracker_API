package com.nohelty.pickemtracker.config.exceptionhandler

import org.springframework.http.HttpStatus

/**
 * Created by Matt.Nohelty on 9/23/2017
 */
class ErrorResponse(status: HttpStatus, val errorDescription: String) {

    val error:String

    init {
        this.error = status.name
    }

}