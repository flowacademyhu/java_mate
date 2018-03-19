package com.flow.string;

public class ProString {
    public static void main(String[] args) {
        String s1 = "Welcome.";
        String s2 = "Welcome.";
        String s3 = new String("Welcome");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println();

        String st1 = new String("Gandalf");
        String st2 = new String("Szürke");
        st1.concat(st2);
        System.out.println(st1);
        System.out.println();

        String str1 = "baba";
        String str2 = "paba";
        String str3 = "maba";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));
        System.out.println();

        String stri1 = 30 + 50 + "Frodó" + 20;
        String stri2 = 30 + 50 + "Frodó" + 20 + 20;
        System.out.println(stri1);
        System.out.println(stri2);
        System.out.println();

        String strin1 = "Hello my name is Slim Shady";
        char[] ch1 = new char[10];
        strin1.getChars(strin1.indexOf("S"), (strin1.indexOf("S") + 10), ch1, 0);
        System.out.println(ch1);
        System.out.println();

        int i = 0;
        int count = 0;
        while (strin1.indexOf("l", i) != -1) {
            i = strin1.indexOf("l", i) + 1;
            System.out.println(i);
            count++;
        }
        System.out.println(count);
        System.out.println();

        System.out.println(party("In this chapter, we will start to do things that can actually be called programming. We will expand our command of the JavaScript language beyond the nouns and sentence fragments we’ve seen so far, to the point where we can express some meaningful prose.",
                "e"));

        }
    static int party(String in, String let) {
        int j = 0;
        int counter = 0;
        while (in.indexOf(let, j) != -1) {
            j = in.indexOf(let, j) + 1;
            counter++;
        }
        return counter;
    }
}
