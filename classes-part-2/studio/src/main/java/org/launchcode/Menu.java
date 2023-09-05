package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(LocalDate date, ArrayList<MenuItem> items) {
        this.lastUpdated = date;
        this.items = items;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Menu: " + "\n" +
                "lastUpdated=" + lastUpdated + "\n" +
                 items ;
    }

    public void addMenuItem (MenuItem newItem) {
        this.items.add(newItem);
        this.setLastUpdated(LocalDate.now());
    }

    public void removeMenuItem(MenuItem item) {
        this.items.remove(item);
        this.setLastUpdated(LocalDate.now());
    }
}



