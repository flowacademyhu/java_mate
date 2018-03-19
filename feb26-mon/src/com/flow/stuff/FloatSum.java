package com.flow.stuff;

public class FloatSum {
    public static void main(String[] args) {
    System.out.println(input(args));
}
    public static float input(String[] in) {
        float intOne = Float.parseFloat(in[0]);
        float intTwo = Float.parseFloat(in[1]);
        float integ = intOne + intTwo;
        return integ;
    }
}
