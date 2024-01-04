package org.launchcode;

public class Menu2 {
    private Date lastUpdated;
    private ArrayList<MItems> MItems ;

    public Menu2(Date lastUpdated, ArrayList<MItems> MItems) {
        this.lastUpdated = lastUpdated;
        this.MItems = MItems;
        this.lastUpdated = new Date();
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<org.lauchcode1.MItems> getMItems() {
        return MItems;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setMItems(ArrayList<org.lauchcode1.MItems> MItems) {
        this.MItems = MItems;
    }
}