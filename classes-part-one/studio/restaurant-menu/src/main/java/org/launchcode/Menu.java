package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    ArrayList<MenuItem> menuItems = new ArrayList<>();

    public void addMenuItem(MenuItem menuItem) {
        //menuItem.setDateAdded(java.time.LocalDate.now());
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

    public void removeMenuItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
    }

    public void isNew(MenuItem menuItem) {
        //condition will never be met... need to make a new equals method
        if (menuItem.getDateAdded() == LocalDate.now()){
            System.out.println("New item!");
        } else {
            System.out.println("Item added to menu on "+menuItem.getDateAdded());
        }
    }
}
