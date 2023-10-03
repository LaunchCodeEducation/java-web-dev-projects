package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        //Comparator comparator = new FlavorComparator();
        System.out.println("========Before Flavors Sort=======");
        for(Flavor flavor: flavors){
            System.out.println(flavor);
        }

        flavors.sort(new FlavorComparator());

        System.out.println("========After Flavors Sort=======");
        for(Flavor flavor: flavors){
            System.out.println(flavor);
        }

        System.out.println("========Before Cones Sort=======");
        for(Cone cone: cones){
            System.out.println(cone);
        }

        cones.sort(new ConeComparator());

        System.out.println("========After Cones Sort=======");
        for(Cone cone: cones){
            System.out.println(cone);
        }


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}