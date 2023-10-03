package org.launchcode;

public class DVD  extends BaseDisc{
    private int spinSpeed;
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    public DVD(String name, String discType) {
        setName(name);
        setDiscType(discType);
        this.spinSpeed = 570; // Default DVD spin speed
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + this.spinSpeed +" - 1600 rpm.");
    }
}
