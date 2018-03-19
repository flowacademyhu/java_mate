package com.flow.drink;

public class Wine {
    private String type;
    private int vintage;

    /**
     * Creating the Wine class with the private type and vintage parameters
     * and using them in the constructor.
     * @param type      The type of the wine.
     * @param vintage   The year the wine was made.
     */

    public Wine(String type, int vintage) {
        this.type = type;
        this.vintage = vintage;
    }

    /**
     * The get method for the type attribute.
     */

    public String getType() {
        return type;
    }

    /**
     * The set method for the type attribute.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * The get method for the vintage attribute.
     */

    public int getVintage() {
        return vintage;
    }

    /**
     * The set method for the vintage attribute.
     */

    public void setVintage(int vintage) {
        if (vintage > 0) {
            this.vintage = vintage;
        }
    }

    /**
     * Overriding the Object ancestor toString method.
     * @return Returning a String that describes the wine filled with the parameters.
     */

    @Override
    public String toString() {
        return "This wine is a " + type + ", from the " + vintage +
                " vintage.";
    }
}
