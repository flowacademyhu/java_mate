package com.flow.practice.vhsservices;

import java.io.*;

public class Main implements Serializable{
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        VHSStore vhsStore;
        ObjectOutputStream oos = null;
        int noOfLines = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader("./input.txt"));
            noOfLines = Integer.parseInt(bufferedReader.readLine());
            String line = bufferedReader.readLine();
            vhsStore = new VHSStore();
            oos = new ObjectOutputStream(new FileOutputStream("./vhsStore.ser"));

            while (line != null) {
                String[] temp = line.split(";");
                switch (temp.length) {
                    case 3:
                        Video video = new Video(temp[0].replace("_", " "), temp[1], Integer.parseInt(temp[2]));
                        vhsStore.addTo(video);
                        break;
                    case 2:
                        TutorialVideo tVideo = new TutorialVideo(temp[0].replace("_", " "), temp[1]);
                        vhsStore.addTo(tVideo);
                        break;
                }
                line = bufferedReader.readLine();
            }

            try {
                System.out.println(vhsStore.lookingFor("Go for dummies", true));
                System.out.println(vhsStore.lookingFor("Üvegtigris", false));
                System.out.println(vhsStore.lookingFor("Ilyennincs", false));
                System.out.println(vhsStore.lookingFor("Ilyennincs", true));
            } catch (NotFoundException e) {
                e.printStackTrace();
            }

            try {
                vhsStore.lookingFor("Üvegtigris", false).rentingOut(16,1);
                vhsStore.lookingFor("Üvegtigris", false).rentingOut(10,1);
            } catch (FailedRentException e) {
                e.printStackTrace();
            }

            oos.writeObject(vhsStore);
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
