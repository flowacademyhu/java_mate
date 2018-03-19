package com.flowacademy.union;

import java.util.Arrays;

public class Union {
    public static void main(String[] args) {
        int[] arrayA = {3, 5, 8, 4, 52, 12};
        int[] arrayB = {41, 52, 8, 17, 24, 92};
        int[] arrayAPlusB = Union.union(arrayA,arrayB);
        System.out.println(Arrays.toString(arrayAPlusB));
    }
    public static int[] union(int[] array1, int[] array2) {
        int[] unio = new int[array1.length+array2.length];
        for (int i = 0; i < array1.length; i++) {
            unio[i] = array1[i];
        }
        int k = array1.length;
        for (int j = 0; j < array2.length; j++) {
            int i = 0;
            while (i < array1.length  && array2[j] != array1[i]) {
                i++;
            }
            if (i >= array1.length) {
                unio[k] = array2[j];
                k++;
            }
        }
        return unio;
    }
}
