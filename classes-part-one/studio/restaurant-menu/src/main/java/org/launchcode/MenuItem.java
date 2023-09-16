package org.launchcode;

import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private Category category;
    private boolean isNew;

    @Override
    public String toString() {
/*        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", isNew=" + isNew +
                '}';*/

        return "Description: " + description+
                "\nCategory: " + category +
                "\nPrice: $" + price +
                "\nNew Item: " + (isNew ? "Yes" : "No")  + "\n\n";
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(description, menuItem.description) && category == menuItem.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, category);
    }

    public boolean isNew() {
        return isNew;
    }

    public MenuItem(double p, String d, Category c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public void setCategory(Category category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
