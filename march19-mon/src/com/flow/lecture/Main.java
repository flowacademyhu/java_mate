package com.flow.lecture;

public class Main {
    public static void main(String[] args) {
        ReadFromFile reader = new ReadFromFile();
        WriteToFile writer = new WriteToFile();
        writer.writeFile("/home/mate/AzEgyAlmai", reader.readFile("/home/mate/poem"));
    }
}
