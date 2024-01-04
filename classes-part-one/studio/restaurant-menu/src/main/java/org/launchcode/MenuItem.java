package org.launchcode;

public class MItems {
    private String itemName;
    private double price;
    private  String description;
    private String category;
    private boolean isItNew;

    public MItems(String itemName, double price, String category, boolean isItNew) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.isItNew = isItNew;
    }


    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isItNew() {
        return isItNew;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setItNew(boolean itNew) {
        isItNew = itNew;
    }
}