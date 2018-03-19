package com.flow.practice.movies;

public class ActionMovie extends Movie {
    private String nameOfHero;
    private boolean male;
    private int numOfDead;

    public ActionMovie(String title, String director, int date, String nameOfHero, boolean male, int numOfDead) {
        super(title, director, date);
        this.nameOfHero = nameOfHero;
        this.male = male;
        this.numOfDead = numOfDead;
    }

    public String getNameOfHero() {
        return nameOfHero;
    }

    public void setNameOfHero(String nameOfHero) {
        this.nameOfHero = nameOfHero;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public int getNumOfDead() {
        return numOfDead;
    }

    public void setNumOfDead(int numOfDead) {
        this.numOfDead = numOfDead;
    }

    @Override
    public String toString() {
        if (male) {
            return super.toString() + " the name of the hero is " + nameOfHero + " he is a guy and kills " + numOfDead + " people during the movie";
        }
        return super.toString() + " the name of the hero is " + nameOfHero + " she is a lady and kills " + numOfDead + " people during the movie";
    }
}