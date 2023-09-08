package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items = new ArrayList<>();

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    //Add item instance method
    public void addItem(MenuItem myItem){
        //Bonus - Prevent Duplicate
        String message = "* That item has already been added to the menu. *";
        if (items.contains(myItem))  {
            System.out.println(message);
            return;
        }
        for (MenuItem item : items) {
            if (item.equals(myItem)) {
                System.out.println(message);
                return;
            }
        }

        items.add(myItem);
        setLastUpdated(LocalDate.now());
    }

    public void removeItem(MenuItem myItem){
        items.remove(myItem);
        setLastUpdated(LocalDate.now());
    }

    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : items) {
            if (item.getCategory().equals("Appetizers")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : items) {
            if (item.getCategory().equals("Main Course")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : items) {
            if (item.getCategory().equals("Desserts")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nTONY'S PIZZA MENU\n\n" +
                "APPETIZERS" + appetizers.toString() +"\n" +
                "MAIN COURSES" + mainCourses.toString() + "\n" +
                "DESSERTS" + desserts.toString() + "\n";

    }

}


