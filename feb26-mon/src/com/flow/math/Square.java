package com.flow.math;

public class Square {
    public static void main(String[] args) {
        System.out.println(territory(args));
        System.out.println(district(args));

    }
    public static double territory(String[] in) {
        double doubleOneT = Double.parseDouble(in[0]);
        double doubleNumT = Math.pow(doubleOneT, 2);
        return doubleNumT;
    }
    public static double district(String[] in) {
        double doubleOneD = Double.parseDouble(in[0]);
        double doubleNumD = 4 * doubleOneD;
        return doubleNumD;
    }
}
