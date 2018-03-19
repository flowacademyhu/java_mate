package com.flow.practice;

import com.flow.practice.vehicle.FreightTrain;
import com.flow.practice.vehicle.PassengerTrain;
import com.flow.practice.vehicle.Train;

public class Railroad {
    public static void main(String[] args) {
        int trainCount = 0;
        for (String arg : args) {
            if (arg.equals("teher") || arg.equals("személy")) {
                trainCount++;
            }
        }

        Train[] iLikeTrains = new Train[trainCount];
        int i = 0;
        int likeCount = 0;
        while (i < args.length) {
            if (args[i].equals("teher")) {
                FreightTrain tempFreight = new FreightTrain(args[i+1], args[i+2],
                        Integer.parseInt(args[i+3]), Integer.parseInt(args[i+4]),
                        args[i+5], Integer.parseInt(args[i+6]));
                iLikeTrains[likeCount] = tempFreight;
                likeCount++;
                i += 7;
            }
            if (args[i].equals("személy")) {
                PassengerTrain tempPassenger = new PassengerTrain(args[i+1], args[i+2],
                        Integer.parseInt(args[i+3]), Integer.parseInt(args[i+4]),
                        Integer.parseInt(args[i+5]));
                iLikeTrains[likeCount] = tempPassenger;
                likeCount++;
                i += 6;
            }
        }

        for (Train iLikeTrain : iLikeTrains) {
            System.out.println(iLikeTrain);
        }

        Train fastest = iLikeTrains[0];
        for (Train iLikeTrain : iLikeTrains) {
            if (fastest.earliest() > iLikeTrain.earliest()) {
                fastest = iLikeTrain;
            }
        }

        System.out.println("The fastest one is:\n" + fastest);
        System.out.println("Time: " + fastest.earliest() + " h");
    }
}
