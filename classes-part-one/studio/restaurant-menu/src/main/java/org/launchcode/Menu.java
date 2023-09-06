package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();


    public Menu(LocalDate d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.menuItems = i;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.menuItems = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem addItem){ this.menuItems.add(addItem); }

    public void removeMenuItem(MenuItem removeItem){ this.menuItems.add(removeItem); }

    public void printAll() {
        System.out.println(menuItems);
    }

    public void printItem(MenuItem item) {
        System.out.println(item.getCategory() + "\n" + item.getName() + "\n" + item.getDescription() +
                "\nPrice: " + item.getPrice());
    }


}
