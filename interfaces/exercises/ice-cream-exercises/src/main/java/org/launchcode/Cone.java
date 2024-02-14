package org.launchcode;

import java.util.ArrayList;

public class Cone extends Ingredient {
    public Cone(String aName, double aCost, ArrayList<String> someAllergens){
        super (aName, aCost, someAllergens);
    }
    public class ConeComparator implements Comparator<Cone> {
        //@Override
        public int compare(Cone cone1, Cone cone2) {
            if (cone1.getCost() - cone2.getCost() < 0){
                return -1;
            } else if (cone1.getCost() - cone2.getCost() > 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
