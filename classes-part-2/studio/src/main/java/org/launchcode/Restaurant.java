package org.launchcode;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem pizza = new MenuItem("Pizza", "Slice of Pepperoni Pizza",1.99,  "Main Course");
        MenuItem chicken = new MenuItem("Chicken", "I'm here for the chicken!",2.99,  "Main Course");
        MenuItem toastedRav = new MenuItem("Toasted Ravioli", "A STL specialty!", 0.99, "Appetizers");
        MenuItem cheeseCake = new MenuItem("Cheese Cake", "Slice of delicious cheese cake", 1.99, "Desserts");

        Menu tonys = new Menu();
        tonys.addItem(pizza);
        tonys.addItem(chicken);
        tonys.addItem(toastedRav);
        tonys.addItem(cheeseCake);
        System.out.println(tonys.toString());

        MenuItem pizza2 = new MenuItem("Pizza", "Slice of Pepperoni Pizza",1.99,  "Main Course");
        System.out.println(pizza.equals(pizza2));

        tonys.addItem(pizza2);
        System.out.println(tonys);
//        tonys.removeItem(pizza2);
//        System.out.println(tonys);
    }
}
