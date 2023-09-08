package org.launchcode;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        // write your code here
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        boolean lookAtMenu = true;
        Scanner input = new Scanner(System.in);
        boolean newI;

        MenuItem item1 = new MenuItem(12.99, "Spaghetti & Meatballs", "Pasta", false);
        MenuItem item2 = new MenuItem(16.99, "Fish & Chips", "Fish", false);
        MenuItem item3 = new MenuItem(9.99, "Creme Brulee", "Dessert", false);

        menuItems.add(item1);
        menuItems.add(item2);
        menuItems.add(item3);

        Menu menu = new Menu(new Date(), menuItems);

        menu.displayMenu();

        MenuItem item4 = new MenuItem(9.99, "Creme Brulee", "Dessert", false);
        MenuItem item5 = new MenuItem(15.99, "Crepe", "Dessert", false);

        //Test Add Item method
        menu.addNewItem(item4);

        //Test Display Item Method
        menu.displayItem(item4);
        menu.displayItem(item5);

        menu.addNewItem(item5);

        //Test Remove Item Method
        menu.removeItem(item4);

    }
}
