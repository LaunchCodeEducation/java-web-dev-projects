package org.launchcode;

public class Main {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Pepperoni Pizza", "The classic slice, hot and delicious!", 7.39, "main course");
        MenuItem item2 = new MenuItem("Toasted Ravioli", "A St. Louis favorite, served with a size of pizza sauce", 6.89, "appetizer");
        MenuItem item3 = new MenuItem("Chocolate Cake", "Rich, moist cake with dark chocolate cream cheese frosting", 4.99, "dessert");
        MenuItem item4 = new MenuItem("Veggie Pizza", "Peppers, onions, mushrooms, olives, and tomatoes make a delicious combo", 6.39, "main course");
        MenuItem item5 = new MenuItem("Garlic Breadsticks", "Hot, garlicky carbs FTW", 4.59, "appetizer");

        Menu menu = new Menu();
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);


        System.out.println(menu);

        System.out.println(item1);

        menu.removeItem(item4);
        System.out.println(menu);


        menu.removeItem(item4);
    }
}
