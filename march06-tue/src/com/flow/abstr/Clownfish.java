package com.flow.abstr;

public class Clownfish extends AquaticAnimals implements Herbivore{
    public Clownfish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " has eaten some underwater weed.");
        setFullness(100);
    }
}
