package com.nohelty.pickemtracker.config.exceptionhandler

import com.nohelty.pickemtracker.exception.ResourceNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Created by Matt.Nohelty on 9/23/2017
 */
@ControllerAdvice
class ExceptionHandler: Throwable() {

    @ExceptionHandler(Throwable::class)
    @ResponseBody
    fun onException(ex: Throwable):ResponseEntity<ErrorResponse> {

        if (ex is ResourceNotFoundException) {
            val errorResponse = ErrorResponse(HttpStatus.NOT_FOUND, ex.getErrorDescription())
            return ResponseEntity(errorResponse, HttpStatus.NOT_FOUND);
        }
        else {
            val errorDescription:String = if (ex.message == null) "error" else ex.message!!
            val errorResponse = ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, errorDescription)
            return ResponseEntity(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
