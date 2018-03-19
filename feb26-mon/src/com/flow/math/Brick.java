package com.flow.math;

public class Brick {
    public static void main(String[] args) {
        System.out.println(volume(args));
        System.out.println(surface(args));

    }
    public static double volume(String[] in) {
        double doubleOneV = Double.parseDouble(in[0]);
        double doubleTwoV = Double.parseDouble(in[1]);
        double doubleThreeV = Double.parseDouble(in[2]);
        return doubleOneV * doubleTwoV * doubleThreeV;
    }
    public static double surface(String[] in) {
        double doubleOneS = Double.parseDouble(in[0]);
        double doubleTwoS = Double.parseDouble(in[1]);
        double doubleThreeS = Double.parseDouble(in[2]);
        return 4 * (doubleOneS + doubleTwoS) + 4 * (doubleTwoS + doubleThreeS) + 4 * (doubleThreeS + doubleOneS);
    }
}
