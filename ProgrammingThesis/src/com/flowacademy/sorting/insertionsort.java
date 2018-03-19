package com.flowacademy.sorting;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arrayToSort = {13, 62, 23, 52, 3, 19, 27, 34};
        insertionsort.insSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
    }
    public static int[] insSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }
}
