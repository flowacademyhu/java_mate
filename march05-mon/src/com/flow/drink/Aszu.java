package com.flow.drink;

public class Aszu extends Wine{
    private int puttonyos;

    /**
     * Creating the Aszu sub-class from the Wine class with the private puttonyos parameter
     * and in the contructor overriding the super type to Aszu and providing the
     * vintage and puttonyos in parameters.
     * @param vintage   The vintage of the wine main class.
     * @param puttonyos The number of puttony the wine has (defining it's quality).
     */

    public Aszu(int vintage, int puttonyos) {
        super("Aszu", vintage);
        this.puttonyos = puttonyos;
    }

    /**
     * The get method for the Puttonyos attribute.
     */

    public int getPuttonyos() {
        return puttonyos;
    }

    /**
     * The set method for the Puttonyos attribute.
     */

    public void setPuttonyos(int puttonyos) {
        if (puttonyos > 0) {
            this.puttonyos = puttonyos;
        }
    }

    /**
     * Overriding the Object ancestor toString method.
     * @return Returning a String that describes the aszú filled with the parameters.
     */

    @Override
    public String toString() {
        return "This is an Aszu, from the " + super.getVintage() +
                " vintage and is " + puttonyos +
                " puttonyos.";
    }
}
