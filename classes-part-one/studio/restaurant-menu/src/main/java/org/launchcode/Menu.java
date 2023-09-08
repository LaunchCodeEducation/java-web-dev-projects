package org.launchcode;

import java.util.ArrayList;
import java.util.Date;


public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date lastUpdated, ArrayList<MenuItem> items) {
        this.lastUpdated = lastUpdated;
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }


}
