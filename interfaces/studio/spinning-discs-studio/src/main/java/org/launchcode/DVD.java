package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{

    private static final int spinSpeed = 32000;

    public DVD(String name, int capacity, String diskType) {
        super(name, capacity, diskType);
    }

    @Override
    public String toString(){
        return super.toString() + " GB.";
    }

    @Override
    public void spinDisc() {
        System.out.println("The spin speed of a " + getDiskType() + " is " + spinSpeed + " rpm.");
    }
}
