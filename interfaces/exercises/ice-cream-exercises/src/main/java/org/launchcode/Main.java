package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    return o1.getName().

    void compareTo(o2.getName());
    public class FlavorComparator implements Comparator<Flavor> {

    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        public static void main(String[] args){
            Case menu = new Case();
            ArrayList<Flavor> flavors = menu.getFlavors();
            ArrayList<Cone> cones = menu.getCones();

        }
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        public static void main(String[] args){
            Case menu = new Case();
            ArrayList<Flavor> flavors = menu.getFlavors();
            ArrayList<Cone> cones = menu.getCones();
            Comparator comparator = new FlavorComparator();
        }
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        public static void main(String[] args){
            Case menu = new Case();
            ArrayList<Flavor> flavors = menu.getFlavors();
            ArrayList<Cone> cones = menu.getCones();
            Comparator comparator = new FlavorComparator();

            flavors.sort(comparator);
        }
    }

        @Override
        public int compare(Flavor o1, Flavor o2) {
            return 0;
        }
    }
    }