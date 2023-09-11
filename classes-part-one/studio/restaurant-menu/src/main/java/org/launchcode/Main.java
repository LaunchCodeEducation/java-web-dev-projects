package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Initializing menu items
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem(5.99, "Bruschetta", Category.APPETIZER, true));
        menuItems.add(new MenuItem(15.99, "Chicken Alfredo", Category.MAIN_COURSE, false));
        menuItems.add(new MenuItem(7.99, "Brownie", Category.DESSERT, false));

        // Using the provided constructor to initialize the Menu
        Menu menu = new Menu(new Date(), menuItems);

        Scanner scanner = new Scanner(System.in);

        String choice;

        do {
            System.out.println("Do you want to print a single item, all menu items, or exit? (Enter 'single', 'all' or '0' to exit)");
            choice = scanner.nextLine().toLowerCase().trim();

            switch(choice) {
                case "single":
                    System.out.println("Please enter the beginning of the item description:");
                    String startOfDescription = scanner.nextLine().toLowerCase().trim();
                    menu.printItemsWithDescription(startOfDescription);
                    break;
                case "all":
                    menu.printMenu();
                    break;
                case "0":
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (!"0".equals(choice));
        scanner.close();
    }
}
