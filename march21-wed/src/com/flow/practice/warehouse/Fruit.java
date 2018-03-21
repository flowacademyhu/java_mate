package com.flow.practice.warehouse;

import com.flow.practice.expection.Bad;

import java.util.Random;

public class Fruit implements Good {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean good() throws Bad {
        Random random = new Random();
        int randInt = random.nextInt(6) + 1;
        if (randInt == 3) {
            throw new Bad("This fruit is rotten, i wouldn't buy it.");
        }
        return randInt % 2 == 0;
    }

    @Override
    public String toString() {
        try {
            if (good()) {
                return "This is a " + name + " and it's good.";
            }
        } catch (Bad e) {
            e.printStackTrace();
        }
        return "This is a " + name + " and it's already bad.";
    }
}

