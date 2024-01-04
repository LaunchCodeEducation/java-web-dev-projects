package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;
public class Flavor extends Ingredient {
    public class FlavorComparator implements Comparator<Flavor> {
        @Override
        public int compare(Flavor flavor1, Flavor flavor2) {
            return flavor1.getName().compareTo(flavor2.getName());
        }
    }

    public Flavor(String aName, double aCost, ArrayList<String> someAllergens){
        super (aName, aCost, someAllergens);
    }


}
