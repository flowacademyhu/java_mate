package com.flow.practice.machines;

public class DrinkMachine extends EmptyMachine{
    private boolean cold;

    public DrinkMachine(int availableCups, boolean cold) {
        super(availableCups, 0, true);
        this.cold = cold;
    }

    public boolean isCold() {
        return cold;
    }

    public void setCold(boolean cold) {
        this.cold = cold;
    }

    @Override
    public String toString() {
        if (cold) {
            return super.toString() + " And it serves cold drinks.";
        }
        return super.toString() + " And it serves hot drinks.";
    }

    @Override
    public void putMoneyIn(int money) {
        if (availableCups == 0 || !functioning) {
            System.out.println("Try again later!");
        } else if (money < 95) {
            System.out.println("Not enough money.");
        } else {
            availableCups--;
            moneyIn += money;
            System.out.println("Please take your tea. Your change is: " + (money - 95) + ".");
        }
    }
}
