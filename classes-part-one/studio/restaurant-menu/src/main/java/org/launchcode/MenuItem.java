package main.java.org.launchcode;


public class MenuItem {

  private String name;

  private double price;

  private String description;

  private String category;

  private Boolean newEntry = true;

  // CONSTRUCTORS

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
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

    public Boolean isNewEntry() {
        return newEntry;
    }

    //Instance Methods

String getMenuItem() {
        return name + "\t Price: " + price + " Desc: " + description;
}

}