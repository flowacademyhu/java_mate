package com.flow.exceptionHandling;

public class InvalidParams extends Exception{
    public InvalidParams() {
    }

    public InvalidParams(String message) {
        super(message);
    }
}
