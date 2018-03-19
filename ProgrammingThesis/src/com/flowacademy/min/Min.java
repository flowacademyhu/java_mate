package com.flowacademy.min;

public class Min {
    public static void main(String[] args) {
        int[] intArray = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            intArray[i] = Integer.parseInt(args[i]);
        }
        System.out.println(tellMin(intArray));
    }
    public static int tellMin(int[] array) {
        int minimum = array[0];
        for(int i = 0; i<array.length; i++){
            if (array[i] < minimum){
                minimum = array[i];
            }
        }
        return minimum;
    }
}