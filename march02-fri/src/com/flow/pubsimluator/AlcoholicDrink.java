package com.flow.pubsimluator;

public class AlcoholicDrink extends Drink implements Alcholic{
    private String taste;
    private double alcoholPercentage;

    public AlcoholicDrink(String taste, double alcoholPercentage) {
        this.taste = taste;
        this.alcoholPercentage = alcoholPercentage;
    }

    @Override
    public double alcoholPercentage() {
        return alcoholPercentage;
    }

    @Override
    String madeOf() {
        return null;
    }

    @Override
    String tastesLike() {
        return taste;
    }

    @Override
    public String toString() {
        return "This is a drink that tastes like " + taste +
                " and has a/an " + alcoholPercentage + "% alcohol content.";
    }
}
