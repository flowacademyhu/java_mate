package com.flow.stuff;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FourVerse {
    public static void main(String[] args) throws IOException {
        FourVerse.readLargerTextFile(poem);
    }

    final static String poem = "/home/mate/poem";
    final static Charset ENCODING = StandardCharsets.UTF_8;

    public static void readLargerTextFile(String fileName) throws IOException{
        Path path = Paths.get(fileName);
        try (Scanner scanner = new Scanner(path, ENCODING.name())) {
            while (scanner.hasNextLine()) {
                log(scanner.nextLine());
            }
        }
    }

    private static void log(Object aMsg) {
            System.out.println(aMsg);
    }
}
