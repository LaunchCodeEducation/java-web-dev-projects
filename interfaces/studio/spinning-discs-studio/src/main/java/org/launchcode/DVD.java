package org.launchcode;

public class DVD extends BaseDisc implements  OpticalDisc {

    public DVD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("I'm sorry, Dave. I'm afraid I can't do that.");
    }


}


