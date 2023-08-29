package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class LaunchCodeMenu {
    private Date lastUpdated;
    private ArrayList<LaunchCodeMenuItem> items;

    public LaunchCodeMenu(Date d, ArrayList<LaunchCodeMenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<LaunchCodeMenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<LaunchCodeMenuItem> getItems() {
        return items;
    }
}
