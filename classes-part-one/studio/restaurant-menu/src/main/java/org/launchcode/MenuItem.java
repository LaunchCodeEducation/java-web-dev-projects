package org.launchcode;
import java.util.Date;
import java.time.LocalDate;

public class MenuItem {
    private LocalDate dateAdded;
    private String name;
    private String category;
    private String description;
    private Double price;


    //Constructors

    public MenuItem(Date dateAdded, String name, String category, String description, Double price) {
        this.dateAdded = LocalDate.now();
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
    }

    public MenuItem(Date dateAdded, String name, String category) {
        this(dateAdded, name, category, null, null);
    }

    //method to see if two menu items are equal
    @Override
    public boolean equals(Object toBeCompared) {
        //check for identity
        if (toBeCompared == this) {
            return true;
        }
        //check for null
        if (toBeCompared == null) {
            return false;
        }
        //check for class
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        //check cast
        MenuItem menuItem = (MenuItem) toBeCompared;
        return menuItem.getName() == getName();
    }
    @Override
    public String toString(){
        return name + " $" + price + " " + dateAdded;
    }

    //Getters and Setters

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}