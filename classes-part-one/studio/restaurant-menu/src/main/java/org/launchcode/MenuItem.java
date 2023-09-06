package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private MenuItemCategoryEnum category;
    private boolean isNew;
    private String name;

    public MenuItem(double price, String description, MenuItemCategoryEnum category, boolean isNew, String name) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.name = name;
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

    public MenuItemCategoryEnum getCategory() {
        return category;
    }

    public void setCategory(MenuItemCategoryEnum category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}