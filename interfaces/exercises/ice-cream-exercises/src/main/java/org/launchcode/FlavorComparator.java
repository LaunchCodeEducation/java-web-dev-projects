package org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor>  {
    @Override
    public int compare(Flavor o1, Flavor o2) {
        return o1.getName().compareTo(o2.getName());

        //int allergensCount1 = 01.allergens.size();
        //int allergensCount2 = 02.allergens.size();

        // Compare allergen counts in reverse order (from highest to lowest)
       //return Integer.compare(allergensCount2, allergensCount1);
    }
}
