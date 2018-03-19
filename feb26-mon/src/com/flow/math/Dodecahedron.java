package com.flow.math;

public class Dodecahedron {
    public static void main(String[] args) {
        System.out.println(volume(args));
        System.out.println(surface(args));
    }

    public static double volume(String[] in) {
        double a = Double.parseDouble(in[0]);
        return (Math.pow(a, 3) * (15 + 7 * Math.sqrt(5))) / 4;
    }

    public static double surface(String[] in) {
        double a = Double.parseDouble(in[0]);
        return 3 * Math.pow(a, 2) * Math.sqrt(25 + 10 * Math.sqrt(5));
    }
}
