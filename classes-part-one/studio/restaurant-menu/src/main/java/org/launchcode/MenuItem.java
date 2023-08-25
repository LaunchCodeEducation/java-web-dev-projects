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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    // Method to determine whether two menu items are equal
    public boolean equals(MenuItem other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        if (Double.compare(other.price, price) != 0) return false;
        if (isNew != other.isNew) return false;
        if (!description.equals(other.description)) return false;
        return category.equals(other.category);
    }

    // Method to print a single menu item
    public void printMenuItem() {
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
        System.out.println("New: " + (isNew ? "Yes" : "No"));
    }
}
