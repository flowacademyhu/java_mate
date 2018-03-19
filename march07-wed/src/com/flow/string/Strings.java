package com.flow.string;

public class Strings {
    public static void main(String[] args) {
        String sentence = "This is an example sentence.";
        String sentenceTwo = "This;is;the;second;sentence.";

        String[] spaceSep = sentence.split(" ");
        String[] pointCommaSep = sentenceTwo.split(";");

        for(int i = 0; i < spaceSep.length; i++) {
            System.out.println("The " + (i + 1) + ". word is: " + spaceSep[i]);
        }

        for(int i = 0; i < pointCommaSep.length; i++) {
            System.out.println("The " + (i + 1) + ". word is: " + pointCommaSep[i]);
        }

    }

}
