package com.flow.inheritance;

public class Cake {
    protected int slice;
    private String flavour;

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    public Cake(int slice, String flavour) {
        this.slice = slice;
        this.flavour = flavour;
    }

    public void info() {
        System.out.println("This cake is " + this.flavour + " flavoured, has " + this.slice + " slices.");
    }
}

