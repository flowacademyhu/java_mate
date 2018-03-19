package com.flow.stuff;

public class FloatNumber {
    public static void main(String[] args) {
        System.out.println(input(args));
    }
    public static float input(String[] in) {
        float num = Float.parseFloat(in[0]);
        return num;
    }
}
