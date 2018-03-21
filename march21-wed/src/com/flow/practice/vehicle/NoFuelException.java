package com.flow.practice.vehicle;

public class NoFuelException extends BrokeDownException{
    public NoFuelException() {
    }

    public NoFuelException(String s) {
        super(s);
    }
}
