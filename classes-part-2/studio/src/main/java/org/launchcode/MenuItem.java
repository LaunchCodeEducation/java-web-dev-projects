package org.launchcode;

import java.time.LocalDate;
import java.util.Objects;
import java.time.temporal.ChronoUnit;



public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private LocalDate dateAdded;

    private boolean isNew;

    public MenuItem(String name, double price, String description, String category, LocalDate dateAdded, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
        this.isNew = isNew;

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

    public void setNew(boolean aNew) {
        this.isNew = aNew;
    }
    public boolean getNew() {
        return isNew;
    }

    public void setDateAdded(LocalDate dateAdded) {this.dateAdded = dateAdded;}

    public void calculateIsNew() {
        LocalDate now = LocalDate.now();
        long difference = ChronoUnit.DAYS.between(this.dateAdded, now);
        if (difference < 31) {
            this.setNew(true);
        } else {
            this.setNew(false);
        }
    }

    @Override
    public String toString() {
        return name + "\n" +
                " price= $" + price + "\n" +
                " description= " + description + "\n" +
                " category= " + category + "\n" + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

