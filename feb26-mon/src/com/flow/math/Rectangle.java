package com.flow.math;

public class Rectangle {
    public static void main(String[] args) {
        System.out.println(territory(args));
        System.out.println(district(args));

    }
    public static double territory(String[] in) {
        double doubleOneT = Double.parseDouble(in[0]);
        double doubleTwoT = Double.parseDouble(in[1]);
        return doubleOneT * doubleTwoT;
    }
    public static double district(String[] in) {
        double doubleOneD = Double.parseDouble(in[0]);
        double doubleTwoD = Double.parseDouble(in[1]);
        return 2 * (doubleOneD + doubleTwoD);
    }
}