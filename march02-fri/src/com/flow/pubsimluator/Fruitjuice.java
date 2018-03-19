package com.flow.pubsimluator;

public class Fruitjuice extends Drink {
    public Fruitjuice(Fruit fruit) {
    }

    @Override
    String madeOf() {
        return null;
    }

    @Override
    String tastesLike() {
        return null;
    }

    @Override
    public String toString() {
        return "This is a fruit juice made of " + madeOf();
    }
}