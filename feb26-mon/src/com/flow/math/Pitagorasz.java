package com.flow.math;

public class Pitagorasz {
    public static void main(String[] args) {
        System.out.println(territory(args));
        System.out.println(district(args));

    }
    public static double territory(String[] in) {
        double doubleOneT = Double.parseDouble(in[0]);
        double doubleSideT = Math.sqrt(doubleOneT);
        return Math.pow(doubleSideT, 2);
    }
    public static double district(String[] in) {
        double doubleOneD = Double.parseDouble(in[0]);
        double doubleSideD = Math.sqrt(doubleOneD);
        return 4 * doubleSideD;
    }
}
