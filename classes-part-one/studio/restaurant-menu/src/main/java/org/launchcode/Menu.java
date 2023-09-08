package org.launchcode;
import java.util.ArrayList;

public class Menu {
    ArrayList<MenuItem> menuItems = new ArrayList<>();

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }
    //method to remove menu item
    public void removeMenuItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
    }
    //method to print entire menu
    public void printMenu() {
        System.out.println("Today's Menu");
        for (MenuItem item : menuItems) {
            System.out.println("\n" + item);
        }
    }

}