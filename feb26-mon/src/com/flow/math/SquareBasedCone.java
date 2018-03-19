package com.flow.math;

public class SquareBasedCone {
    public static void main(String[] args) {
        System.out.println(volume(args));
        System.out.println(surface(args));
    }

    public static double volume(String[] in) {
        double r = Double.parseDouble(in[0]);
        double h = Double.parseDouble(in[1]);
        return (Math.PI * Math.pow(r, 2) * h) / 3;
    }

    public static double surface(String[] in) {
        double r = Double.parseDouble(in[0]);
        double h = Double.parseDouble(in[1]);
        return Math.PI * Math.pow(r, 2) + Math.PI * r * Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2));
    }
}
