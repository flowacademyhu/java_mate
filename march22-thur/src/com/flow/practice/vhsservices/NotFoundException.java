package com.flow.practice.vhsservices;

public class NotFoundException extends FailedRentException {
    public NotFoundException() {
    }

    public NotFoundException(String s) {
        super(s);
    }
}
