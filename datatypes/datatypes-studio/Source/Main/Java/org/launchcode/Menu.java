package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

//public class Menu {
//    private Date lastUpdated;
//    private ArrayList<MenuItem> items;
//
//    public Menu(Date d, ArrayList<MenuItem> i) {
//        this.lastUpdated = d;
//        this.items = i;
//    }
//
//    public void setLastUpdated(Date lastUpdated) {
//        this.lastUpdated = lastUpdated;
//    }
//
//    public void setItems(ArrayList<MenuItem> items) {
//        this.items = items;
//    }
//
//    public Date getLastUpdated() {
//        return lastUpdated;
//    }
//
//    public ArrayList<MenuItem> getItems() {
//        return items;
//    }
//}





public class Menu {
    private ArrayList<MenuItem> items;

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public static void menuSetter(ArrayList){
       for (Object menuItem:ArrayList){
           if (category = "Apps") {
               System.out.println(menuItem);
           }

       }
        for (Object menuItem:ArrayList) {
            if (category = "Entrees") {
                System.out.println(menuItem);
            }
        }

        for (Object menuItem:ArrayList) {
            if (category = "Desserts") {
                System.out.println(menuItem);
            }
        }


    }
}
