package org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor>{

    @Override
    public int compare(Flavor flavor1, Flavor flavor2){
        if (flavor1.getAllergens().size() < (flavor2.getAllergens().size())){
            return -1;
        } else if(flavor1.getAllergens().size() > (flavor2.getAllergens().size())){
            return 1;
        } else {
            return 0;
        }
    }

}
