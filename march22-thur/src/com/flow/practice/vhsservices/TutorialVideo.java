package com.flow.practice.vhsservices;

final public class TutorialVideo extends Video {
    public TutorialVideo(String title, String howLong) {
        super(title, howLong, 0);
    }

    @Override
    public boolean rentingOut(int age, int days) throws FailedRentException {
        int rDays = 0;
        switch (getHowLong()) {
            case "one":
                rDays = 1;
                break;
            case "two":
                rDays = 2;
                break;
            case "unlimited":
                rDays = 2147483647;
                break;
            default:
                System.out.println("I don't believe that's possible");
        }
        if (isRented()) {
            return false;
        }
        if (days <= rDays) {
            setRented(true);
            System.out.println("Here you go!");
            return true;
        }
        throw new FailedRentException("Sorry, but you are not allowed to rent this VHS.");
    }

    @Override
    public int hashCode() {
        return getAgeRating();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        TutorialVideo tutorial = (TutorialVideo) o;

        return (this.getTitle().equals(tutorial.getTitle()) &&
                this.getAgeRating() == tutorial.getAgeRating() &&
                this.isRented() == tutorial.isRented() &&
                this.getHowLong().equals(tutorial.getHowLong()));
    }
}
