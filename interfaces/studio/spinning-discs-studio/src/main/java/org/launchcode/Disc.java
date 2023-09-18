package org.launchcode;

import java.util.ArrayList;

public abstract class Disc {
    private int spinSpeed;
    private int storageSize;
    private double discThickness;
    private ArrayList<String> infoStored = new ArrayList<>();
    private int numberOfSides;

    public Disc(int spinSpeed, int storageSize, double discThickness, ArrayList<String> infoStored, int numberOfSides) {
        this.spinSpeed = spinSpeed;
        this.storageSize = storageSize;
        this.discThickness = discThickness;
        this.infoStored = infoStored;
        this.numberOfSides = numberOfSides;
    }

    public int getSpinSpeed(){
        return spinSpeed;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public double getDiscThickness() {
        return discThickness;
    }

    public ArrayList<String> getInfoStored() {
        return infoStored;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }
}
