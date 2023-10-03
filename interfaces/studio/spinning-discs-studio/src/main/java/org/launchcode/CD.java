package org.launchcode;

public class CD extends BaseDisc{
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    private int spinSpeed;

    public CD(String name, String discType) {
        setName(name);
        setDiscType(discType);
        this.spinSpeed = 200; // Default CD spin speed
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + this.spinSpeed +" - 500 rpm.");
    }
}
