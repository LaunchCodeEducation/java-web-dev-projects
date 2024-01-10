package org.launchcode;
import java.util.HashMap;

public abstract class BaseDisc{


//public class BaseDisc{
    private final int storageCapacity;

    private int discData;
    private int spinSpeed;
    private boolean isFull;

    private HashMap<String, String> discInfo;

    public BaseDisc(int storageCapacity, int spinSpeed) {
        //Object discData;
        this.discData = discData;
        this.storageCapacity = storageCapacity;
        this.spinSpeed = spinSpeed;
        this.isFull = false;
        this.discInfo = new HashMap<>();


    }


    public void getDiscData () {
        System.out.println("Store it here");

    }

    public int getStorageCapacity () {
        return this.storageCapacity;

    }

    public int getSpinSpeed () {
        return spinSpeed;


    }

    public boolean isFull () {
        return isFull;
    }

    public HashMap<String, String> getDiscInfo () {
        return discInfo;

    }
}




