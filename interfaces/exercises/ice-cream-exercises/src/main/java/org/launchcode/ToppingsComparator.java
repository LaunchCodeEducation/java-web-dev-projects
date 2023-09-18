package org.launchcode;

import java.util.Comparator;

public class ToppingsComparator implements Comparator<Toppings> {

    @Override
    public int compare(Toppings toppings1, Toppings toppings2) {
        return toppings1.getName().compareTo(toppings2.getName());
    }
}
