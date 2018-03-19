package com.flow.friday.travel;

import com.flow.friday.travel.ticket.ReturnTicket;
import com.flow.friday.travel.ticket.Ticket;

public class MainTravel {
    public static void main(String[] args) {
        int ticketNum = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("return") || args[i].equals("simple")) {
                ticketNum++;
            }
        }
        int counter = 0;
        Ticket[] tickets = new Ticket[ticketNum];
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("return")) {
                ReturnTicket temp = new ReturnTicket(args[i + 1], Integer.parseInt(args[i + 2]), Integer.parseInt(args[i + 3]));
                tickets[counter] = temp;
                counter++;
                i += 3;
            }
            if (args[i].equals("simple")) {
                Ticket temp = new Ticket(args[i + 1], Integer.parseInt(args[i + 2]), Integer.parseInt(args[i + 3]));
                tickets[counter] = temp;
                counter++;
                i += 3;
            }
        }
        Ticket max = tickets[0];
        for (int i = 0; i < tickets.length; i++) {
            if (max.getPrice() < tickets[i].getPrice()) {
                max = tickets[i];
            }
        }
        System.out.println(max);
    }
}
