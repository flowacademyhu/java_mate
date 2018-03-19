package com.flow.stuff;

public class FloatDivWhole {
    public static void main(String[] args) {
        System.out.println(input(args));
    }
    public static int input(String[] in) {
        float floatOne = Float.parseFloat(in[0]);
        float floatTwo = Float.parseFloat(in[1]);
        int intOne = Math.round(floatOne);
        int intTwo = Math.round(floatTwo);
        int integ = intOne / intTwo;
        return integ;
    }
}
