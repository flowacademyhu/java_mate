package com.flow.pubsimluator;

public class Aszu extends Wine{
    private int puttony;

    public Aszu(String taste, double alcoholPercentage, String grape, String origin, int puttony) {
        super(taste, alcoholPercentage, grape, origin);
        this.puttony = puttony;
    }

    @Override
    public String toString() {
        return "This is an aszu that tastes like " + tastesLike() +
                " and has a/an " + alcoholPercentage() + "% alcohol content " +
                " made of " + getGrape() +
                " grapes and comes from " + getOrigin() +
                " and it's degree of quality is " + puttony + " puttony.";
    }
}
