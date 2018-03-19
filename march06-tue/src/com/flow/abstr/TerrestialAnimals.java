package com.flow.abstr;

public abstract class TerrestialAnimals extends Animals{
    public TerrestialAnimals(String name) {
        super(name);
    }

    private int numberOfLegs;

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
