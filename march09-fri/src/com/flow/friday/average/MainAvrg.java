package com.flow.friday.average;

public class MainAvrg {
    public static void main(String[] args) {
        int counter = 1;
        int lastArg = Integer.parseInt(args[args.length-1]);
        if (lastArg > 0) {
            float sum = Float.parseFloat(args[args.length-2]);
            int j = args.length-2;
            while (j > 0 && (j-lastArg) > 0) {
                sum += Float.parseFloat(args[j-lastArg]);
                j -= lastArg;
                counter++;
            }
            float avr = sum / counter;
            System.out.println(avr);
        } else {
            System.out.println("The last number must be a positive number!");
        }

    }
}
