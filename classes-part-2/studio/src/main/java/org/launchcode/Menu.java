package org.launchcode;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;



public class Menu {
    private ArrayList<MenuItem> items = new ArrayList<>();

    private LocalDate lastUpdated;
    // GETTERS & SETTERS

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : items) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : items) {
            if (item.getCategory().equals("main course")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : items) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        } return "\n Café de Codage\n" + "Le Repas:\n" + "Appetizers\n" + appetizers.toString() + "\n" + "Main Courses\n" +
                mainCourses + "\n" + "Desserts\n" + desserts;
    }

    public void addMenuItem(MenuItem newItem) {
        String message = "That item has already been added to the menu.";
        if (items.contains(newItem)) {
            System.out.println(message);
            return;
        }
        for(MenuItem item : items){
            if(item.equals(newItem)) {
                System.out.println(message);
                return;
            }
        }
        items.add(newItem);
        lastUpdated = LocalDate.now();
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
        lastUpdated = LocalDate.now();
    }
    public void displayMenu() {
        System.out.println("\n" + "Last updated: " + lastUpdated);
    }


}