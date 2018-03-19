package com.flow.math;

public class Throwing {
    public static void main(String[] args) {
        System.out.println("The max height reached is: " + throwing(args)[2]);
        System.out.println("The time needed to reach this height is: " + throwing(args)[3]);
        System.out.println("The moment we are currently looking at is: " + args[2] + "s.");
        System.out.println("The horizontal position of the ball is: " + throwing(args)[0]);
        System.out.println("The vertical position of the ball is: " + throwing(args)[1]);
    }
    static double[] throwing(String[] in) {
        final double G = 9.81;
        double degreeIn = Double.parseDouble(in[0]);
        double degree = Math.toRadians(degreeIn);
        double v0 = Double.parseDouble(in[1]);
        double t = Double.parseDouble(in[2]);
        double x = v0 * t * Math.cos(degree);
        double y = v0 * t * Math.sin(degree) - G / 2 * Math.pow(t, 2);
        double d = (Math.pow(v0, 2) * Math.sin(2 * degree)) / G;
        double yMax = (Math.pow(v0, 2) * Math.pow(Math.sin(degree), 2)) / (2 * G);
        double tMax = (v0 * Math.sin(degree)) / G;
        if (x > d) { ;
            return new double[] {d, 0, yMax, tMax};
        } else {
            return new double[] {x, y, yMax, tMax};
        }
    }
}
