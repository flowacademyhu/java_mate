package com.flow.math;

public class Cube {
    public static void main(String[] args) {
        System.out.println(volume(args));
        System.out.println(surface(args));
    }

    public static double volume(String[] in) {
        double a = Double.parseDouble(in[0]);
        return Math.pow(a, 3);
    }

    public static double surface(String[] in) {
        double a = Double.parseDouble(in[0]);
        return 6 * Math.pow(a, 2);
    }
}
