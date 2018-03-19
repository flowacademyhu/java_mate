package com.flowacademy.sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int [] arrayToSort = {12,54,32,94,61,4,26,74};
        bubblesort.bubbleSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
    }
    public static int[] bubbleSort(int[] array) {
        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
