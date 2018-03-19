package com.flow.pit;

public class StringPit {
    private String[] stringPit;
    private static int pointer;

    public StringPit(int length) {
        this.stringPit =new String[length];
        pointer = 0;
    }

    public void push (String in) throws TooMuchOOB {
        if (pointer == stringPit.length) {
            throw new TooMuchOOB("The pit is full.");
        }
        stringPit[pointer] = in;
        pointer++;
    }


    public String pop () throws NegativeOOB {
        if (pointer == 0) {
            throw new NegativeOOB("There are no more items to pop.");
        }
        String out = stringPit[pointer];
        pointer--;
        return out;
    }

    public boolean search (String has) {
        for (int i = 0; i < pointer; i++) {
            if (stringPit[i].equals(has)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String toS = "";
        for (int i = 0; i < pointer; i++) {
            toS += "\\ " + stringPit[i] + " /" +  "\n";
        }
        return toS;
    }


}
