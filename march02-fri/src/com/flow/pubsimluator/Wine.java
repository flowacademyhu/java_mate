package com.flow.pubsimluator;

public class Wine extends AlcoholicDrink{
    private String grape;
    private String origin;

    public Wine(String taste, double alcoholPercentage, String grape, String origin) {
        super(taste, alcoholPercentage);
        this.grape = grape;
        this.origin = origin;
    }

    public String getGrape() {
        return grape;
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public String toString() {
        return "This is a wine that tastes like " + tastesLike() +
                " and has a/an " + alcoholPercentage() + "% alcohol content " +
                " made of " + grape +
                " grapes and comes from " + origin + ".";
    }
}
