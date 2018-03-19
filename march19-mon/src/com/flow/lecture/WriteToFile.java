package com.flow.lecture;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        WriteToFile writeToFile = new WriteToFile();
        writeToFile.writeFile("./barna", "pici Dorácska ^^");
    }
    public void writeFile (String filename, String toWrite) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filename));
            bufferedWriter.write(toWrite);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
