package com.flow;

import com.flow.drink.Aszu;
import com.flow.drink.Wine;

public class Main {

    /**
     * The main method that let's you run the program. It tests the given arguments
     * when running the application and if the first argument is aszú it generates
     * a new Aszu object with the rest of the arguments telling the vintage and
     * the degree of quality, else it takes the first argument as the type of the wine
     * and the second as the vintage.
     * @param args The argument given, when running the application.
     */

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("Aszu")) {
                Aszu aszu = new Aszu(Integer.parseInt(args[i + 1]), Integer.parseInt(args[i + 2]));
                thisWine(aszu);
                i += 2;
            } else {
                Wine wine = new Wine(args[i], Integer.parseInt(args[i + 1]));
                thisWine(wine);
                i += 1;
            }
        }
    }

    /**
     * Writing out the given wine classed object.
     */

    static void thisWine (Wine wine) {
        System.out.println(wine);
    }
}
