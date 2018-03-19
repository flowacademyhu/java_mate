package com.flow.math;

public class Circle {
    public static void main(String[] args) {
        System.out.println(territory(args));
        System.out.println(district(args));

    }
    public static double territory(String[] in) {
        double doubleDiamT = Double.parseDouble(in[0]);
        double doubleRadT = doubleDiamT / 2;
        return Math.pow(doubleRadT, 2) * 3.14;
    }
    public static double district(String[] in) {
        double doubleDiamD = Double.parseDouble(in[0]);
        return doubleDiamD * 3.14;
    }
}
