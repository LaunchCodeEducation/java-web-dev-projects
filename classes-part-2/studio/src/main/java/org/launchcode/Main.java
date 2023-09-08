package org.launchcode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    static Date date = new Date();
    static ArrayList<MenuItem> list = new ArrayList<>();
    static String newItem;
    static Menu menu = new Menu(date, list);



    public static void addFood(MenuItem aName) {

        if(list.contains(aName)){
            System.out.println("Item by that name already exist on the menu.");
         } else {
             list.add(aName);
         }
    }

    public static void removeFood(MenuItem aName){
        list.remove(aName);
        System.out.println(aName.getDescription() + " was removed from the menu.");
    }

    public static String oneItem(int num) {
        MenuItem oneFood =  null;
        ArrayList<MenuItem> foodArray = new ArrayList<>();
        for (MenuItem item : menu.getItems()){
            foodArray.add(item);
        }
        int selection = menu.getItems().size() - 1;
        if(num < menu.getItems().size()) {
             oneFood = foodArray.get(num);
            if(oneFood.isNew()){
                newItem = "NEW" + " " + "Added " + menu.getLastUpdated();
            } else {
                newItem = " ";
            }
            return "\n" + oneFood.getDescription() + " - $" + oneFood.getPrice() + "\n"
                    + oneFood.getCategory() + " " + newItem + "\n";
        } else {
            return "You selected Number: " + num + ". There are not that many foods. Pick 0 - "
                    + selection;
        }
    }




    public static void main(String[] args) {
        MenuItem steak = new MenuItem( 40.00 ,"Steak with honeyGlaze", "Main Course", true );
        MenuItem iceCream = new MenuItem(5.00, "Ice Cream", "Dessert", false);
        MenuItem stirFry = new MenuItem(14.00, "Stir Fry", "Main course", false);
        MenuItem breadSticks = new MenuItem(2.00, "Break Sticks", "Appetizer", false);
        MenuItem cheeseSticks = new MenuItem(3.00, "Cheese Sticks", "Appetizer", true);

        addFood(steak);
        addFood(iceCream);
        addFood(stirFry);
        addFood(breadSticks);
        addFood(cheeseSticks);
        System.out.println("Trying to add MenuItem Steak a second time.");
        addFood(steak);

        System.out.print("\nPrinting the full menu.");
        for (MenuItem item : menu.getItems()) {
            if(item.isNew()){
                newItem = "NEW" + " " + "Added " + menu.getLastUpdated();
            } else {
                newItem = " ";
            }
            System.out.println("\n" + item.getDescription() + " - Price: " + "$" + item.getPrice() + "\n"
                    + "Category: " + item.getCategory() + " " + newItem + "\n");
        }
        System.out.print("Printing the last time the menu was updated\n");
        System.out.println("Page last updated: " + menu.getLastUpdated());

        System.out.println("Menus size " + menu.getItems().size());
        System.out.println(oneItem(4));

        removeFood(cheeseSticks);

        System.out.println("Menu size " + menu.getItems().size());
        System.out.println(oneItem(4));
        System.out.println(oneItem(1));

    }

}

//