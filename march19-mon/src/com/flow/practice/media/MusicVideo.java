package com.flow.practice.media;

public class MusicVideo extends Mp3{
    private int width;
    private int height;

    public MusicVideo(String artist, String album, String name, float length, int width, int height) {
        super(artist, album, name, length);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + " and it's display size is " + width + ":" + height;
    }
}
