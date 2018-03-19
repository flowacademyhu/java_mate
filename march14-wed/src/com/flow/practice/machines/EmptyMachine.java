package com.flow.practice.machines;

public class EmptyMachine {
    protected int moneyIn;
    protected int availableCups;
    protected boolean functioning;

    public EmptyMachine(int availableCups, int moneyIn, boolean functioning) {
        this.moneyIn = moneyIn;
        this.availableCups = availableCups;
        this.functioning = functioning;
    }

    public int getMoneyIn() {
        return moneyIn;
    }

    public void setMoneyIn(int moneyIn) {
        this.moneyIn = moneyIn;
    }

    public int getAvailableCups() {
        return availableCups;
    }

    public void setAvailableCups(int availableCups) {
        this.availableCups = availableCups;
    }

    public boolean isFunctioning() {
        return functioning;
    }

    public void setFunctioning(boolean functioning) {
        this.functioning = functioning;
    }

    @Override
    public String toString() {
        if (functioning) {
            return "The machine is currently working and has " + moneyIn + "money in it.";
        }
        return "The machine is currently out of order and has " + moneyIn + "money in it.";
    }

    public void putMoneyIn (int money) {
        System.out.println("This machine is currently empty. Please don't use it.");
    }
}
