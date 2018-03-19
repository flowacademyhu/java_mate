package com.flow.math;

public class Triangle {
    public static void main(String[] args) {
        System.out.println(territory(args));
        System.out.println(district(args));

    }
    private static double territory(String[] in) {
        double doubleOneT = Double.parseDouble(in[0]);
        double doubleTwoT = Double.parseDouble(in[1]);
        double doubleThreeT = Double.parseDouble(in[2]);
        double doubleS = (doubleOneT + doubleTwoT + doubleThreeT) / 2;
        return Math.sqrt(doubleS*(doubleS-doubleOneT)*(doubleS-doubleTwoT)*(doubleS-doubleThreeT));
    }
    private static double district(String[] in) {
        double doubleOneD = Double.parseDouble(in[0]);
        double doubleTwoD = Double.parseDouble(in[1]);
        double doubleThreeD = Double.parseDouble(in[2]);
        return doubleOneD + doubleTwoD + doubleThreeD;
    }
}
