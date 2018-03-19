package com.flow.stuff;

public class FirstVerse {
    public static void main(String[] args) {
        String[] poem = {"Szabó Lőrinc - Az Egy álmai",
                "",
                "Mert te ilyen vagy s ők olyanok",
                "és neki az érdeke más",
                "s az igazság idegállapot",
                "vagy megfogalmazás",
                "s mert kint nem tetszik semmi sem",
                "s mert győzni nem lehet a tömegen",
                "s ami szabály, mind nélkülem",
                "született:",
                "ideje volna végre már",
                "megszöknöm közületek."};
        FirstVerse.forLoop(poem);
    }
    public static void forLoop (String[] text) {
        for (int i = 0; i < text.length; i++ ) {
            System.out.println(text[i]);
        }
    }
}
