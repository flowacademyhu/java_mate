package com.flow.publictransport.human;

import com.flow.publictransport.human.Human;

public class Passenger extends Human {
    private int tickets;
    private boolean pass;
    private boolean validTicket;

    public Passenger(String name, int age, int tickets, boolean pass) {
        super(name, age);
        this.tickets = tickets;
        this.pass = pass;
        validTicket = false;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    public boolean isValidTicket() {
        return validTicket;
    }

    public void setValidTicket(boolean validTicket) {
        this.validTicket = validTicket;
    }

    @Override
    public String toString() {
        return "[name: " + getName() +
                "; age: " + getAge() +
                "; number of tickets: " + tickets +
                "; has a pass:" + pass + "]";
    }
}
