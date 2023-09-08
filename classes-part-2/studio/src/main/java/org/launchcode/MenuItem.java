package org.launchcode;
import org.launchcode.Menu;
import java.util.ArrayList;

//public class MenuItem {
//    private double price;
//    private String description;
//    private String category;
//    private boolean isNew;
//
//    public MenuItem(double p, String d, String c, boolean iN) {
//        this.price = p;
//        this.description = d;
//        this.category = c;
//        this.isNew = iN;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public void setNew(boolean aNew) {
//        isNew = aNew;
//    }
//}








public class MenuItem {
   private  String category;
   private String itemName;
   private Double price;
   private String description;
   private Boolean novelty = true;
//   private ArrayList<Object> allMenuItems = new ArrayList <>();


    public MenuItem(String category, String itemName, Double price, String description){
        this.category = category;
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        //allMenuItems.add(this);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getNovelty() {
        return novelty;
    }

    public void setNovelty(Boolean novelty) {
        this.novelty = novelty;
    }
}

//MenuItem wings = new MenuItem ("apps", "wings", 10, "lightly breaded and fried chicken wings served with sauces")
//MenuItem lambChops = new MenuItem ("entrees", "Lamb Chops", 28.35, "Rack of Lamb Chops in cilantro ginger marinade on a bed of shishieto peppers with chili honey glaze")
//MenuItem chocolateCake = new MenuItem ("desserts", "chocolate cake", 6.95, "A soft and tender Chocolate Fudge cake covered in a rich and creamy chocolate buttercream\n")