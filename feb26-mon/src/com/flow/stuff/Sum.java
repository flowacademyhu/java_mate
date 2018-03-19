package com.flow.stuff;

public class Sum {
    public static void main(String[] args) {
        System.out.println(input(args));
    }
    public static int input(String[] in) {
        int intOne = Integer.parseInt(in[0]);
        int intTwo = Integer.parseInt(in[1]);
        int integ = intOne + intTwo;
        return integ;
    }
}
