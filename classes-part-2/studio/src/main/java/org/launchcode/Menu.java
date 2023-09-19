package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n" + item.toString() + "\n");
            }
        }
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourses.append("\n" + item.toString() + "\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n" + item.toString() + "\n");
            }
        }
        return "\nTONY'S PIZZA MENU\n" +
                "APPETIZERS" + appetizers.toString() + "\n" +
                "MAIN COURSES" + mainCourses.toString() + "\n" +
                "DESSERTS" + desserts.toString() + "\n";
    }
    void removeItem(MenuItem item) {
        menuItems.remove(item);
    }
    void addItem(MenuItem newItem) {
        menuItems.add(newItem);
    }
}