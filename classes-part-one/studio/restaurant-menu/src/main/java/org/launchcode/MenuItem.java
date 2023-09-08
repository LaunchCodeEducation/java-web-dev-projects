package org.launchcode;
import java.util.Date;
import java.time.LocalDate;

public class MenuItem {
    private Double price;
    private String name;
    private String description;
    private String category;
    private Boolean isNew = false;
    private LocalDate dateAdded;

    public MenuItem(String name, String category, Date dateAdded, Boolean isNew, Double price, String description) {

        this.name = name;
        this.category = category;
        this.dateAdded = LocalDate.now();
        this.isNew = false;
        this.price = price;
        this.description = description;
    }
    public MenuItem(String name, String category, Date dateAdded, Boolean isNew) {
        this(name, category, dateAdded, isNew, null, null);
    }

    //print individual menu item??
//    public static void printItem() {
//        System.out.println(menuItem);
//    }

    //getters and setters


    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Boolean getNew() {
        return isNew;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }


    //not sure if this is kosher, but it works. update to cohere with book after reading next chapter
    @Override
    public String toString() {
        return name + " - " + category + " - $" + price + " - added to menu on " + dateAdded;
    }

    @Override
    public boolean equals(Object toBeCompared) {

        //same thing?
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
        //cast - convert item to be compared to same class
        MenuItem theMenuItem = (MenuItem) toBeCompared;
        return theMenuItem.getName() == getName();
    }

}
