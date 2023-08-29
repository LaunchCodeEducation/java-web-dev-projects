package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    ArrayList<MenuItem> menuItems = new ArrayList<>();

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);

        //update isNew to false when item is 10 days old using Date class
        menuItem.isNew = false;


    }
}