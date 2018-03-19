package com.flow.practice.movies;

public class Movie {
    protected final String title;
    protected final String director;
    protected final int date;

    public Movie(String title, String director, int date) {
        this.title = title;
        this.director = director;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "This is the movie " + title + " directed by " + director + " in " + date;
    }

    public boolean nominateToOscars (int nominatedIn) {
        if (nominatedIn == date || nominatedIn == date + 1) {
            return Math.round(Math.random()) == 1;
        }
        return false;
    }
}
