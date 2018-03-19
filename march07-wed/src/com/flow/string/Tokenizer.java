package com.flow.string;

import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        String str = "abcd, text,something kitten;puppy;bear snowman baker";

        StringTokenizer st = new StringTokenizer(str);

        System.out.println("The first run of StringTokenizer with default parameters.");
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            System.out.println(tmp);
        }
        System.out.println();

        System.out.println("The second run of StringTokenizer with ; , . separators.");
        st = new StringTokenizer(str, ";,.");

        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            System.out.println(tmp);
        }
    }
}
