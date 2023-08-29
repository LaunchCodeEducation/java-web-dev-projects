package org.launchcode;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //instantiate a menu
    Menu menu = new Menu();

    //instantiate some menu items
    MenuItem item1 = new MenuItem("Farro Salad", "Appetizer", new Date(), true, 8.99, "Delicious");
    MenuItem item2 = new MenuItem("Steak 'n Frites", "Main Course", new Date(), true, 18.99, "Delicious");
    MenuItem item3 = new MenuItem("Panna Cotta", "Dessert", new Date(), true, 11.99, "Housemade");

    //add items to menu
    menu.addMenuItem(item1);
    menu.addMenuItem(item2);
    menu.addMenuItem(item3);

    menu.printMenu();
    }
}
