package org.launchcode;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {

    private String name;

    private double price;

    private String description;

    private String category;

   // private Boolean newEntry = true;

    private final LocalDate dateAdded;

    // CONSTRUCTORS

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = LocalDate.now();
//        // Test isNew() to be false
//        this.dateAdded =  LocalDate.parse("2022-06-21");
    }


    // GETTERS & SETTERS

    public String getName() {
        return name;
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

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setName(String name) {
        this.name = name;
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

//    public void setDateAdded(LocalDate dateAdded) {
//        dateAdded = dateAdded;
//    }

//    public Boolean isNewEntry() {
//        return newEntry;
//    }
//TODO: Define custom toString() Method
    @Override
    public String toString() {
        String newText = isNew() ? " - NEW!" : "";
        return name + newText + "\n" +
                description + " | $" + price;
    }

    //TODO: Definecustomer equals() method
    @Override
public boolean equals(Object toBeCompared) {

        if(this == toBeCompared) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }

        MenuItem otherItem = (MenuItem) toBeCompared;

        return this.name.equals(otherItem.getName());
    }


    //Instance Methods
    boolean isNew() {
        LocalDate today= LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBetween <90;
    }

    String getMenuItem() {
        return name + "\t Price: " + price + " Desc: " + description;
    }

}