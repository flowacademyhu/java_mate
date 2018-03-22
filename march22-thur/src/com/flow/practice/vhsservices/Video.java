package com.flow.practice.vhsservices;

public class Video implements Rentable {
    private String title;
    private boolean rented;
    private String howLong;
    private int ageRating;

    public Video(String title, String howLong, int ageRating) {
        this.title = title;
        if (howLong.equals("one") || howLong.equals("two") || howLong.equals("unlimited")) {
            this.howLong = howLong;
        }
        if (ageRating == 0 || ageRating == 12 || ageRating == 16 || ageRating == 18) {
            this.ageRating = ageRating;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public String getHowLong() {
        return howLong;
    }

    public void setHowLong(String howLong) {
        this.howLong = howLong;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }

    @Override
    public String toString() {
        if (rented) {
            return "This VHS is " + title + ", it's currently rented out, can be rented for " + howLong + " and has an age rating of " + ageRating + " day.";
        }
        return "This VHS is " + title + ", it's currently available, can be rented for " + howLong + " and has an age rating of " + ageRating + " day.";
    }

    @Override
    public boolean rentingOut(int age, int days) throws FailedRentException {
        int rDays = 0;
        switch (howLong) {
            case "one":
                rDays = 1;
                break;
            case "two":
                rDays = 2;
                break;
            case "unlimited":
                rDays = Integer.MAX_VALUE;
                break;
        }
        if (rented) {
            System.out.println("Sorry, but it's already out.");
            return false;
        }
        if (age >= ageRating && days <= rDays) {
            rented = true;
            System.out.println("Here you go!");
            return true;
        }
        throw new FailedRentException("Sorry, but you are not allowed to rent this VHS.");
    }

    @Override
    public boolean bringingBack() {
        if (rented) {
            rented = false;
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ageRating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Video video = (Video) o;

        return (this.title.equals(video.title) &&
                this.ageRating == video.ageRating &&
                this.rented == video.rented &&
                this.howLong.equals(video.howLong));
    }
}
