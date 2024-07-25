package com.student.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(IdMissing.class)//kis class ka exception handle karna hai..
    public ResponseEntity<AppError>handlrIdMissing(IdMissing ex){
        AppError error= new AppError("invalid",new Date(),500);
//        error.setErrorDescription("Invalid");
        //error.setDate(new Date());
        //error.setStatusCode(500);
        return  new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);


    }
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
//    public Map<String,String> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
//        Map<String ,String>errorMap= new HashMap<>();
//        ex.getBindingResult().getFieldErrors().forEach(error->errorMap.put(error.getField(), error.getDefaultMessage())
//        );
//        return errorMap;

    }


//}
