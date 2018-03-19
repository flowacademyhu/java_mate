package com.flow.practice.market;

import com.flow.practice.market.good.Fruit;

public class Customer {
    private Fruit[] basket;
    private int money;
    private int fruitCount;

    public Customer(int basketSize, int money) {
        this.basket = new Fruit[basketSize];
        this.money = money;
        fruitCount = 0;
    }

    public Fruit[] getBasket() {
        return basket;
    }

    public void setBasket(Fruit[] basket) {
        this.basket = basket;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getFruitCount() {
        return fruitCount;
    }

    public void setFruitCount(int fruitCount) {
        this.fruitCount = fruitCount;
    }

    @Override
    public String toString() {
        String list = "";
        for (Fruit fruit: basket) {
            list += fruit + " ";
        }
        return "This customer's basket contains: " + list + "And she has " + money + "Ft.";
    }

    public void buying(Fruit fruit) {
        if (!fruit.getColor().equals("green")) {
            System.out.println("Sorry but we would only like to buy green fruits.");
        } else if (money - fruit.getPrice() < 0) {
            System.out.println("We sadly cannot buy this " + fruit);
        } else {
            money -= fruit.getPrice();
            System.out.println("We bought this " + fruit);
            basket[fruitCount] = fruit;
            fruitCount++;
        }
    }
}
