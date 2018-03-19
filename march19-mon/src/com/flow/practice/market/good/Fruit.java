package com.flow.practice.market.good;

public class Fruit {
    private String type;
    private int price;
    private String color;

    public Fruit(String type, String color, int price) {
        this.type = type;
        this.price = price;
        if (color.equals("green") || color.equals("red") || color.equals("yellow")) {
            this.color = color;
        } else {
            System.out.println("Sorry but we only have green, yellow and red fruits.");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return type + " that is " + color + " and costs " + price + "Ft.";
    }
}
