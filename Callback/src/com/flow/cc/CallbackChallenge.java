package com.flow.cc;

import java.lang.reflect.Method;

public class CallbackChallenge {
    public static void main(String[] args) {
        fV(1, 2, (callBack));
    }
    private static void fV(int a, int b, Method sum) {
        return sum(a + b);
    }
    private static void callBack(int x) {
        System.out.println( "A and B equals: " + x);
    }
}
