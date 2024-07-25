package com.student.student.exception;

public class IdMissing extends RuntimeException{
    public IdMissing(){


    }
    public IdMissing(String msg){
        super(msg);
    }
}
