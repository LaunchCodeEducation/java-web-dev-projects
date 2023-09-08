package org.launchcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

import static java.rmi.Naming.list;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        ArrayList<MenuItem> list = new ArrayList<>();
        Menu menu = new Menu(date, list);
        MenuItem steak = new MenuItem(40.00, "steak", "main category", true);
        MenuItem iceCream = new MenuItem(5.00, "ice cream", "dessert", false);
        list.add(steak);
        list.add(iceCream);
        menu.setItems(list);
        menu.setLastUpdated(date);

        steak.setPrice(30.00);

        Object food = menu.getItems();
        Date updated = menu.getLastUpdated();

        System.out.println(food + " " + updated);

    }
}
