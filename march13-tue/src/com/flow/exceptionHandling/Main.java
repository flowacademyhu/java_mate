package com.flow.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(divide2(9, 0));
        } catch (InvalidParams invalidParams) {
            System.out.println("Please don't divide with zero!");
            /* invalidParams.printStackTrace(); */
        } finally {
            System.out.println("Don't forget to donate some money to me!");
        }
    }

    private static float divide(int one, int two) throws InvalidParams {
        if (two == 0) {
            throw new InvalidParams("Please don't divide with zero!");
        }
        return one/two;
    }

    private static float divide2(int one, int two) throws InvalidParams {
        return divide(one,two);
    }
}
