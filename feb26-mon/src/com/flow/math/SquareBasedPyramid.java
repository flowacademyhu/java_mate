package com.flow.math;

public class SquareBasedPyramid {
    public static void main(String[] args) {
        System.out.println(volume(args));
        System.out.println(surface(args));
    }

    public static double volume(String[] in) {
        double a = Double.parseDouble(in[0]);
        double mA = Double.parseDouble(in[1]);
        return (Math.pow(a, 2) * Math.sqrt(Math.pow(mA, 2) - Math.pow((Math.pow(a, 2) / 2), 2))) / 3;
    }

    public static double surface(String[] in) {
        double a = Double.parseDouble(in[0]);
        double mA = Double.parseDouble(in[1]);
        return Math.pow(a, 2) + (4 * a * mA) / 2;
    }
}