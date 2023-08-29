package org.launchcode;
import java.util.Date;

public class MenuItem {
    private Date dateAdded;
    private String name;
    private String category;
    public boolean isNew = true;
    private String description;
    private Double price;


    //Constructors

    public MenuItem(Date dateAdded, String name, String category, boolean isNew, String description, Double price) {
        this.dateAdded = dateAdded;
        this.name = name;
        this.category = category;
        this.isNew = isNew;
        this.description = description;
        this.price = price;
    }

    public MenuItem(Date dateAdded, String name, String category) {
        this(dateAdded, name, category, true, null, null);
    }

    //Getters and Setters
}