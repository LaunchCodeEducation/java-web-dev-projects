package org.launchcode;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
public class Main {

    private static Date menuDate = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
    public static void main(String[] args) {
        // write your code here
        ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();

        MenuItem Eggs = new MenuItem(2.00, "From a chicken", "Breakfast", false);
        MenuItem Bacon = new MenuItem(1.00, "Crispy, greasy, bacon", "Breakfast", false);
        MenuItem Toast = new MenuItem(0.50, "Warm bread", "Breakfast", true);
        MenuItem Burger = new MenuItem(5.00, "Best Burger in Town", "notBreakfast", false);
        MenuItem Fries = new MenuItem(1.00, "Fried potatoes", "notBreakfast", false);
        MenuItem Pie = new MenuItem(3.50, "Apple Pie", "Dessert", false);
        MenuItem Cake = new MenuItem(3.50, "Chocolate cake", "Dessert", true);

    menuItemList.add(Eggs);
    menuItemList.add(Bacon);
    menuItemList.add(Toast);
    menuItemList.add(Burger);
    menuItemList.add(Fries);



    Menu myMenu = new Menu(menuDate, menuItemList);

    Menu.showMenu(myMenu);
    Menu.showMenuItem(Eggs);
    myMenu.addItem(Pie);
    myMenu.addItem(Cake);
    myMenu.removeItem(Eggs);
    Menu.showMenu(myMenu);

    }
}
