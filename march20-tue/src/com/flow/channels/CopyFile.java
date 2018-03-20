package com.flow.channels;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        CopyFile copy = new CopyFile();
        copy.copyfile("/home/mate/poem", "/home/mate/Az egy almai");
    }

    public void copyfile(String from, String to) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(from));
            bufferedWriter = new BufferedWriter(new FileWriter(to));
            String line = bufferedReader.readLine();

            while (line != null) {
                bufferedWriter.write(line + "\n");
                line = bufferedReader.readLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
