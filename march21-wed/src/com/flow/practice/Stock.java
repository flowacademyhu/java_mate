package com.flow.practice;

import com.flow.practice.expection.Bad;
import com.flow.practice.warehouse.DairyProduct;
import com.flow.practice.warehouse.Fruit;

import java.io.*;
import java.util.ArrayList;

/*
3
T;150000;1336375889609;Tej
Gy;Barack
T;350000;1336375900000;Tejföl
 */

public class Stock {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<Fruit>();
        ArrayList<DairyProduct> dairyProducts = new ArrayList<DairyProduct>();

        BufferedReader bufferedReader = null;
        BufferedWriter toTrash = null;
        BufferedWriter toShelf = null;

        int noOfGoods = 0;

        try {
            bufferedReader = new BufferedReader(new FileReader("./input.csv"));
            toTrash = new BufferedWriter(new FileWriter("./trash.csv"));
            toShelf = new BufferedWriter(new FileWriter("./shelf.csv"));
            noOfGoods = Integer.parseInt(bufferedReader.readLine());

            System.out.println("We currently have " + noOfGoods + " wares in our store.");
            String line = bufferedReader.readLine();

            while (line != null) {
                    String[] temp = line.split(";");
                    if (temp[0].equals("Gy")) {
                        Fruit fruit = new Fruit(temp[1]);
                        fruits.add(fruit);
                        line = bufferedReader.readLine();
                    }
                    if (temp[0].equals("T")) {
                        DairyProduct dairyProduct = new DairyProduct(temp[3], Long.parseLong(temp[1]) * 1000, Long.parseLong(temp[2]));
                        dairyProducts.add(dairyProduct);
                        line = bufferedReader.readLine();
                    }
            }

            for (Fruit fruit : fruits) {
                StringBuilder temp = new StringBuilder();
                temp.append("Gy;").append(fruit.getName()).append("\n");
                try {
                    if (fruit.good()) {
                        toShelf.write(temp.toString());
                    } else {
                        toTrash.write(temp.toString());
                    }
                } catch (Bad bad) {
                    toTrash.write(temp.toString());
                    bad.printStackTrace();
                }
            }

            for (DairyProduct dairyProduct: dairyProducts) {
                StringBuilder temp = new StringBuilder();
                temp.append("T;").append(dairyProduct.getDueDate()).append(";").append(dairyProduct.getProdDate()).append(";").append(dairyProduct.getName()).append("\n");
                try {
                    if (dairyProduct.good()) {
                        toShelf.append(temp.toString());
                    }
                } catch (Bad bad) {
                    toTrash.append(temp.toString());
                    bad.printStackTrace();
                }
            }

            toTrash.flush();
            toShelf.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                toTrash.close();
                toShelf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

}
