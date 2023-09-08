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

    public void addNewItem(MenuItem item){
        if(!items.contains(item)){
            item.setNew(true);
            items.add(item);
            setLastUpdated(new Date());
            displayMenu();
        }
        else{
            System.out.println("Menu already contains item. Please try again.\n");
        }
    }

    public void removeItem(MenuItem item){
        if(items.contains(item)){
            items.remove(item);
            setLastUpdated(new Date());
            displayMenu();
        }
        else{
            System.out.println("Menu does not contain this item. Please try again.\n");
        }
    }

    public void displayMenu(){
        System.out.println("Today's Menu");
        for(MenuItem item: items){
            if(item.isNew()){
                System.out.println("New Item");
            }
            System.out.println(item.getCategory());
            System.out.println(item.getDescription() + "                " + item.getPrice());
        }
        System.out.println();
    }

    public void displayItem(MenuItem item){
        if(items.contains(item)){
            int ind = items.indexOf(item);
            if(items.get(ind).isNew()){
                System.out.println("New Item");
            }
            System.out.println(items.get(ind).getCategory());
            System.out.println(items.get(ind).getDescription() + "                " + items.get(ind).getPrice());
            System.out.println();
        }
        else{
            System.out.println("Menu does not contain this item. Please try again.\n");
        }
    }
}


