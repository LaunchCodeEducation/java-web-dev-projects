package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	MenuItem newAppOne = new MenuItem(3.99, "This is a yummy appetizer!", MenuItemCategoryEnum.APPETIZER, true,
            "Edamame");
	MenuItem newAppTwo = new MenuItem(5.99, "This is a yummy appetizer!", MenuItemCategoryEnum.APPETIZER, true,
            "Crab Rangoon");
	MenuItem newAppThree = new MenuItem(6.99, "This is another yummy appetizer!", MenuItemCategoryEnum.APPETIZER,
            false, "Fried Gyoza");
    MenuItem newEntreeOne = new MenuItem(10.99, "Delicious Entree", MenuItemCategoryEnum.MAIN_COURSE, false, "Chicken" +
            " " +
            "Hibachi Fried Rice");
    MenuItem newEntreeTwo = new MenuItem(15.99, "Another delicious Entree", MenuItemCategoryEnum.MAIN_COURSE, true,
            "Yaki Soba");
    MenuItem newEntreeThree = new MenuItem(17.99, "Yet another delicious Entree", MenuItemCategoryEnum.MAIN_COURSE,
            false, "Steak Teriyaki");
    MenuItem newDessertOne = new MenuItem(6.99, "Yummy dessert!", MenuItemCategoryEnum.DESSERT, false, "Tempura " +
            "Cheesecake");
    MenuItem newDessertTwo = new MenuItem(7.99, "Another yummy dessert", MenuItemCategoryEnum.DESSERT, true,
            "Chocolate Lave Cake");

    //Menu Items
        // menu item
        // menu item

        Menu currentMenu = new Menu(LocalDate.now(), new ArrayList<>());

        currentMenu.getItems().add(newAppOne);
        currentMenu.getItems().add(newAppTwo);
        currentMenu.getItems().add(newAppThree);
        currentMenu.getItems().add(newEntreeOne);
        currentMenu.getItems().add(newEntreeTwo);
        currentMenu.getItems().add(newEntreeThree);
        currentMenu.getItems().add(newDessertOne);
        currentMenu.getItems().add(newDessertTwo);

        // all items added to menu
        System.out.println("*****************");
        System.out.println(currentMenu.getItems());
        System.out.println("*****************");
        currentMenu.printItem(newAppTwo);
        currentMenu.printItem(newEntreeThree);
        currentMenu.printItem(newDessertTwo);

        // iterate over the currentMenu arraylist(s)
        // for MenuItem : currentMenu.getItems()
        // print out the properties you want
        //

    }
}
