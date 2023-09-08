package org.launchcode;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public boolean isNew() { return isNew; }
    public void setNew(boolean aNew) { isNew = aNew; }
}
