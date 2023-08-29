package org.launchcode;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu menu = new Menu();

        MenuItem menuItem1 = new MenuItem(new Date(), "Breakfast Burrito", "Breakfast");

        MenuItem menuItem2 = new MenuItem(new Date(), "Bean Burrito", "Entree", true, "Flour tortilla filled with refried beans and cheese.", 5.00);

        menu.addMenuItem(menuItem1);
        menu.addMenuItem(menuItem2);


    }
}
