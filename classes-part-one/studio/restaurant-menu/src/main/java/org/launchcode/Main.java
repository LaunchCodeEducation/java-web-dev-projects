package org.launchcode;

public class Main {

    public static void main(String[] args) {
        MenuItem bananaPancake = new MenuItem(10.00, "pancakes made with bananas and walnuts", "entree", true);
        System.out.println(bananaPancake.getprice());
        MenuItem oatmeal = new MenuItem(6.00, "steel cut oatmeal", "entree", true);
        Menu breakfastMenu = new Menu(082323, bananaPancake, oatmeal);
        System.out.println(breakfastMenu.getItems());
    }
}
