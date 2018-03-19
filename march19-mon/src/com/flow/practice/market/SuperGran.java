package com.flow.practice.market;

import com.flow.practice.market.good.Fruit;

import java.util.Random;

public class SuperGran extends Customer{
    private boolean haggling;

    public SuperGran(int basketSize, int money) {
        super(basketSize, Math.round(money * 0.8f));
        Random random = new Random();
        haggling = random.nextBoolean();
        setFruitCount(0);
    }

    @Override
    public void buying(Fruit fruit) {
        if (!fruit.getColor().equals("green") && !fruit.getColor().equals("yellow")) {
            System.out.println("Sorry but we would only like to buy green or yellow fruits.");
        } else if ((haggling && getMoney() - Math.round(fruit.getPrice() * 0.9f) < 0) || getMoney() - fruit.getPrice() < 0) {
            System.out.println("We sadly cannot buy this " + fruit);
        } else if (haggling) {
            if (Math.random() > 0.25) {
                setMoney(getMoney() - Math.round(fruit.getPrice() * 0.9f));
                System.out.println("We bought this " + fruit);
                getBasket()[getFruitCount()] = fruit;
                setFruitCount(getFruitCount() + 1);
                toldYouSo();
            } else {
                setMoney(getMoney() - fruit.getPrice());
                System.out.println("We bought this " + fruit + " Couldn't haggle this time.");
                getBasket()[getFruitCount()] = fruit;
                setFruitCount(getFruitCount() + 1);
            }
        } else {
            setMoney(getMoney() - fruit.getPrice());
            System.out.println("We bought this " + fruit);
            getBasket()[getFruitCount()] = fruit;
            setFruitCount(getFruitCount() + 1);
        }
    }

    public void toldYouSo() {
        System.out.println("I told you my darling that we can haggle with this salesman.");
    }

    @Override
    public String toString() {
        if (haggling) {
            return "She's a supper granny who can haggle. " + super.toString();
        }
        return "She's a supper granny who cannot haggle. " + super.toString();
    }
}
