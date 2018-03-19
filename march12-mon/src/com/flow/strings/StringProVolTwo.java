package com.flow.strings;

public class StringProVolTwo {
    public static void main(String[] args) {
        String data = "This is my personal phone number: 06-30 031/7654 please don't tell anyone.";
        String safeData = data.replaceAll("[\\d-+\\s/()]{6,18}", " <phone number> ");
        System.out.println(safeData);
        System.out.println(divide(9.32f, 0));
    }

    static float divide(float one, float two) {
        return one/two;
    }
}
