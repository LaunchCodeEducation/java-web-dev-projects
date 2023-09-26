package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{

    public CD(String aName, int maxCapacity, String aType, int someUsedCapacity){
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Would you like to play a game?");
    }
}
