package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    @Override
    public String toString() {
/*        return "Menu{" +
                "lastUpdated=" + lastUpdated +
                ", items=" + items +
                '}';*/

        return "Menu (Last Updated: " + lastUpdated + ")\n items=" + items;
    }

    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    // Add item to menu and update the lastUpdated date
    public void addItem(MenuItem item) {
        this.items.add(item);
        updateLastUpdated();
    }

    //    // Remove item from menu and update the lastUpdated date
    public void removeItem(MenuItem item) {
        this.items.remove(item);
        updateLastUpdated();
    }

    // Print a single menu item
    public void printMenuItem(MenuItem item) {
        System.out.println("Description: " + item.getDescription());
        System.out.println("Category: " + item.getCategory());
        System.out.println("Price: $" + item.getPrice());
        System.out.println("New Item: " + (item.isNew() ? "Yes" : "No"));
        System.out.println();
    }

    // Print the entire menu
    public void printMenu() {
        System.out.println("Menu (Last Updated: " + lastUpdated + ")");
        for (MenuItem item : items) {
            printMenuItem(item);
        }

        //System.out.println(this);o
    }

    public void printItemsWithDescription(String startOfDescription) {
        boolean found = false;
        for (MenuItem item : items) {
            if (item.getDescription().toLowerCase().startsWith(startOfDescription)) {
                printMenuItem(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items matched your description.");
        }
    }

    private void updateLastUpdated() {
        this.lastUpdated = new Date();
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}
