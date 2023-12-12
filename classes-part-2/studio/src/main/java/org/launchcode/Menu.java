package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
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

    public void addItem(MenuItem item) {
        this.items.add(item);
//        setLastUpdated();
    }
    public void removeItem(MenuItem item) {
        this.items.remove(item);
    }

    public static void showMenu(Menu menu) {
       System.out.println(menu.toString());
    }

    @Override
    public String toString() {
        return "Menu{" +
                "items=" + items +
                '}';
    }

    public static void showMenuItem(MenuItem item) {
        System.out.println(item.toString());
    }

}


