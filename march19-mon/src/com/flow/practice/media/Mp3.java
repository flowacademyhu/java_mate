package com.flow.practice.media;

public class Mp3 {
    private String artist;
    private String album;
    private String name;
    private float length;

    public Mp3(String artist, String album, String name, float length) {
        this.artist = artist;
        this.album = album;
        this.name = name;
        this.length = length;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "This track is from " + artist +
                " and is called " + name +
                ". It can be found on the album " + album +
                " and it's length is " + length;
    }
}
