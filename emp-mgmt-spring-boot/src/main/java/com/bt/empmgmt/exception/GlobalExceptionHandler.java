package com.bt.empmgmt.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handlerIllegalUser(Exception exception){
        System.out.println("Exception in the GLOBAL IllegalArgumentException :: "+exception);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"message\": \"IllegalArgumentException user\"}");

    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handlerRuntimeException(Exception exception){
        System.out.println("Exception from IllegalArgumentException :: "+exception);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"message\": \"IllegalArgumentException user\"}");

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handlerGeneric(Exception exception){
        System.out.println("Exception from Generic :: "+exception);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"message\": \"Generic Exception user\"}");

    }
}