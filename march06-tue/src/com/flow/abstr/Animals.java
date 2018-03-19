package com.flow.abstr;

public abstract class Animals {
    private String name;
    private int fullness;
    private int strength;

    public Animals(String name) {
        this.name = name;
        this.fullness = 100;
        this.strength = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFullness() {
        return fullness;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public abstract String sound();
}
