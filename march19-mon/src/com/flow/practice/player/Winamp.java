package com.flow.practice.player;

import com.flow.practice.media.Mp3;
import com.flow.practice.media.MusicVideo;

import java.sql.Array;

public class Winamp {
    private int size;
    private Mp3[] favorites;
    private int counter;

    public Winamp(int size) {
        this.size = size;
        favorites = new Mp3[size];
        counter = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(Mp3 mp3) {
        favorites[counter] = mp3;
        counter++;
    }

    public Mp3 get(int i) {
        return favorites[i];
    }

    public void info(Mp3 mp3) {
        System.out.println(mp3);
    }

    public static void main(String[] args) {
        Winamp bestOf2017 = new Winamp(Integer.parseInt(args[0]));
        Mp3 no1 = new Mp3("Gorillaz feat. De La Soul", "Humanz", "Momentz", 3.16f);
        MusicVideo no2 = new MusicVideo("Gorillaz feat. D.R.A.M.", "Humanz", "Andromeda", 3.17f, 1920, 1080);
        Mp3 no3 = new Mp3("The Glitch Mob feat. Arama", "See Without Eyes", "Take me with you", 5.35f);
        MusicVideo no4 = new MusicVideo("Illenium feat. Annika Wells", "Awake", "Crawl outta love", 4.02f, 1920, 1080);
        bestOf2017.add(no1);
        bestOf2017.add(no2);
        bestOf2017.add(no3);
        bestOf2017.add(no4);

        float sumLength = 0;
        for (Mp3 best: bestOf2017.favorites) {
            bestOf2017.info(best);
            sumLength += best.getLength();
        }
        System.out.println();
        System.out.println(sumLength/bestOf2017.favorites.length);
    }
}
