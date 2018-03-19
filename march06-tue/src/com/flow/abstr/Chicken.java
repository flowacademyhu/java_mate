package com.flow.abstr;

public class Chicken extends TerrestialAnimals implements Herbivore{
    public Chicken(String name) {
        super(name);
        setNumberOfLegs(2);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " has eaten a handful of seeds.");
        setFullness(100);
    }

    @Override
    public String sound() {
        return "ka-kaw";
    }

}
