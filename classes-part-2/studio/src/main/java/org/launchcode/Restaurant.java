package org.launchcode;
import java.time.LocalDate;
import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {


        MenuItem greenEggsAndHam = new MenuItem("Green Eggs and Ham", 10.00, "delicious green eggs and ham!", "breakfast", LocalDate.now().minusDays(40), true);
        System.out.println(greenEggsAndHam);
        MenuItem porridge = new MenuItem("Goldilocks' Porridge", 6.00, "Oatmeal at just the right temp!", "breakfast", LocalDate.now(), true);
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(greenEggsAndHam);
        menuItems.add(porridge);
        Menu menu = new Menu(LocalDate.now(),menuItems);
        MenuItem blueberryPancakes = new MenuItem("Blueberry Pancakes", 13.00, "a delicious stack of pancakes", "breakfast", LocalDate.now(), true);
        menu.addMenuItem(blueberryPancakes);
        menu.removeMenuItem(blueberryPancakes);
        System.out.println(menu);
        greenEggsAndHam.calculateIsNew();
        System.out.println(greenEggsAndHam.getNew());
    }
}

