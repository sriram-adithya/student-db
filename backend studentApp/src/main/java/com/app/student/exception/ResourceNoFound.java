package com.app.student.exception;

public class ResourceNoFound extends RuntimeException{
    public ResourceNoFound(String message){
        super(message);
    }
}
