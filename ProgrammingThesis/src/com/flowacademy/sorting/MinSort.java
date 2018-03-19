package com.flowacademy.sorting;

import java.util.Arrays;

public class MinSort {
    public static void main(String[] args) {
        int[] arrayToOrganize = {12,54,32,94,61,4,26};
        MinSort.forLoop(arrayToOrganize);
        System.out.println(Arrays.toString(arrayToOrganize));
    }
    public static int[] forLoop(int[] array) {
        int min;
        for(int i=0; i < array.length; i++) {
            min = i;
            for(int j=i+1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        return array;
    }
}
