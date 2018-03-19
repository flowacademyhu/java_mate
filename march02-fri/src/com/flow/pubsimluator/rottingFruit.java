package com.flow.pubsimluator;

public class rottingFruit extends Fruit implements Alcholic{
    private double alcoholPercentage;

    public rottingFruit(String kind, String flavor, double alcoholPercentage) {
        super(kind, flavor);
        this.alcoholPercentage = alcoholPercentage;
    }

    @Override
    public double alcoholPercentage() {
        return alcoholPercentage;
    }

    @Override
    public String toString() {
        return "This is a " + getKind() +
                " and it tastes like " + getFlavor() +
                " and has " + alcoholPercentage();
    }
}
