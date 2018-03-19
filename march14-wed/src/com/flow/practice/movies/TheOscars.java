package com.flow.practice.movies;

public class TheOscars {
    int yearOfEvent;
    Movie[] listOfMovies;
    static String nameOfFounder;

    public TheOscars(int yearOfEvent, Movie[] listOfMovies) {
        this.yearOfEvent = yearOfEvent;
        this.listOfMovies = listOfMovies;
        nameOfFounder = "Louis B. Mayer";
    }

    public static void main(String[] args) {
        int movieCounter = 0;
        for (String arg: args) {
            if (arg.equals("movie") || arg.equals("actionmovie")){
                movieCounter++;
            }
        }
        Movie[] paramList = new Movie[movieCounter];
        int listCounter = 0;
        for (int i =0; i < args.length; i += 2) {
            if (args[i].equals("movie")) {
                String[] temp = args[i + 1].split(",");
                Movie newMovie = new Movie(temp[0].replace('_', ' '),
                        temp[1].replace('_', ' '),
                        Integer.parseInt(temp[2]));
                paramList[listCounter] = newMovie;
                listCounter++;
            }
            if (args[i].equals("actionmovie")) {
                String[] temp = args[i + 1].split(",");
                Movie newActionMovie = new ActionMovie(temp[0].replace('_', ' '),
                        temp[1].replace('_', ' '),
                        Integer.parseInt(temp[2]),
                        temp[3].replace('_', ' '),
                        Boolean.parseBoolean(temp[4]),
                        Integer.parseInt(temp[5]));
                paramList[listCounter] = newActionMovie;
                listCounter++;
            }
        }
        TheOscars galaOf2016 = new TheOscars(2016, paramList);
        for (Movie movies: galaOf2016.listOfMovies) {
            System.out.println(movies);
            System.out.println(movies.nominateToOscars(galaOf2016.yearOfEvent) + "\n");
        }
    }
}
