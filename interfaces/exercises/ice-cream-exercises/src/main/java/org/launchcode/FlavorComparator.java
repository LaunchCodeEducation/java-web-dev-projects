package main.java.org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator <Flavor> {
    @Override
    public int compare(Flavor flavor1, Flavor flavor2){
        //return 0; results in no sorting. replace with below.
        return flavor1.getName().compareTo(flavor2.getName());

    }
}
