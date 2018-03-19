package com.flow.practice;

import com.flow.practice.market.Customer;
import com.flow.practice.market.SuperGran;
import com.flow.practice.market.good.Fruit;

import java.util.Random;

public class MarketMain {
    public static void main(String[] args) {
        try {
            for (String arg: args) {
                String[] input = arg.split("_");
                if (input.length < 5) {
                    throw new MarketException("Not enough fruit on the market!");
                }
                Fruit[] market = new Fruit[input.length - 2];
                int marketCounter = 0;
                int fruitCounter = 2;
                for (int k = 0; k < input.length - 2; k++) {
                    String[] tempString = input[fruitCounter].split(",");
                    Fruit temp = new Fruit(tempString[0], tempString[1], Integer.parseInt(tempString[2]));
                    market[marketCounter] = temp;
                    fruitCounter++;
                    marketCounter++;
                }

                Customer me = new Customer(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
                SuperGran mama = new SuperGran(Integer.parseInt(input[0]), Integer.parseInt(input[1]));

                System.out.println(shopping(market, me));
                System.out.println(me);
                System.out.println();
                System.out.println(shopping(market, mama));
                System.out.println(mama);
                System.out.println();
            }
        } catch (MarketException error) {
            error.printStackTrace();
        }
    }

    static int shopping(Fruit[] fruits, Customer customer) {

        if (fruits.length >= 3) {
            int originMoney = customer.getMoney();
            int difference = 0;
            for (int i = 0; i < customer.getBasket().length; i++) {
                Random randGen = new Random();
                int randInt = randGen.nextInt(fruits.length);
                customer.buying(fruits[randInt]);
                difference = originMoney - customer.getMoney();
            }
            return difference;
        }
        return 0;
    }
}
