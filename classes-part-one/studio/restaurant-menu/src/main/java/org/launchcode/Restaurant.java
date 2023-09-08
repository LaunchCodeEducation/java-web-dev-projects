package org.launchcode;


import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        Date date = new Date();
        ArrayList<MenuItem> list = new ArrayList<>();

        Menu menu = new Menu(date, list);

        MenuItem steak = new MenuItem(40.00, "steak", "Main course", true);
        MenuItem iceCream = new MenuItem(5.00, "ice cream", "Dessert", false);
        MenuItem stirFry = new MenuItem(14.00, "Stir Fry", "Main course", false);
        MenuItem breadSticks = new MenuItem(2.00, "Break Sticks", "Appetizer", false);
        list.add(steak);
        list.add(iceCream);
        list.add(stirFry);
        list.add(breadSticks);


        System.out.println(steak.getCategory());

    }
}
