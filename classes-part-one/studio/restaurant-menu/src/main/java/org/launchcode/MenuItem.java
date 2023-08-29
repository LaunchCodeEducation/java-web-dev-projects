package org.launchcode;
import java.util.Date;

public class MenuItem {
    private Double price;
    private String name;
    private String description;
    private String category;
    private Boolean isNew = false;
    private Date dateAdded = new Date();

    public MenuItem(String name, String category, Date dateAdded, Boolean isNew, Double price, String description) {

        this.name = name;
        this.category = category;
        this.dateAdded = dateAdded;
        this.isNew = false;
        this.price = price;
        this.description = description;
    }
    public MenuItem(String name, String category, Date dateAdded, Boolean isNew) {
        this(name, category, dateAdded, isNew, null, null);
    }

    //not sure if this is kosher, but it works. update to cohere with book after reading next chapter
    public String toString() {
        return name + " - " + category + " - $" + price;
    }

}
