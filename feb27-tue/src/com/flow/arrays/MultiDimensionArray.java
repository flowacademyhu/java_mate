package com.flow.arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][] twoDimension = {{0, 1, 2, 45, 32}, {3, 4, 5}, {6, 7, 8}};
        int[][] doubleDimension = new int[5][3];
        for(int i = 0; i < twoDimension.length; i++) {
            for(int j = 0; j < twoDimension[i].length; j++) {
                System.out.print(twoDimension[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < doubleDimension.length; i++) {
            for(int j = 0; j < doubleDimension[i].length; j++) {
                System.out.print(doubleDimension[i][j] + " ");
            }
            System.out.println();
        }
        String[][] stringTwo = {{"a", "b", "c"}, {"d", "e", "f", "g", "h"}, {"i", "j", "k", "l"}};
        for(int i = 0; i < stringTwo.length; i++) {
            for(int j = 0; j < stringTwo[i].length; j++) {
                System.out.print(stringTwo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
