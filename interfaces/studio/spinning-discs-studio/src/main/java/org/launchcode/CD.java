package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {

    private static final int spinSpeed = 23000;

    public CD(String name, int capacity, String diskType) {
        super(name, capacity, diskType);
    }

    @Override
    public String toString(){
        return super.toString() + " MB.";
    }

    @Override
    public void spinDisc() {
        System.out.println("The spin speed of " + getDiskType() + " is " + spinSpeed + " rpm.");
    }

}
