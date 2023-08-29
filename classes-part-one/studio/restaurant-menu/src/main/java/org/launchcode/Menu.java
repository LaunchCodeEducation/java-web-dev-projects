package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    ArrayList<MenuItem> menuItems = new ArrayList<>();

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
        //something about date class
//        menuItem.isNew = true;
//        menuItem.dateAdded = new Date();
    }

    //works thanks to the toString method in MenuItem
    public void printMenu(){
        System.out.println("Today's Menu");
        for(MenuItem item : menuItems) {
            System.out.println("\n"+item);
        }
    }

}
