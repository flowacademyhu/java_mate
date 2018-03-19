package com.flow.pubsimluator;

public class Fruit {
    private String kind;
    private String flavor;

    public Fruit(String kind, String flavor) {
        this.kind = kind;
        this.flavor = flavor;
    }

    public String getKind() {
        return kind;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return "This is a " + kind + " and it tastes like " + flavor + ".";
    }
}
