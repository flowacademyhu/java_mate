package com.flow.practice.vhsservices;

public interface Rentable {
    boolean rentingOut (int age, int days) throws FailedRentException;

    boolean bringingBack ();
}
