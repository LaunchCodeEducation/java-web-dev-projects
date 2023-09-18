package org.launchcode;


//This class also extends BaseDisc and implements the OpticalDisc interface. It provides the specific implementation for DVDs
public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String name, double storageCapacity) {
        super(name, storageCapacity);
    }

    // method to provide DVD-specific spinning behavior.
    //Implements the methods defined in the OpticalDisc interface for DVD-specific behavior
    @Override
    public void spinDisc() {
        // Override spinDisc() method for DVD
        System.out.println("A DVD spins at a rate of " + DVD_MIN_SPIN_SPEED + " - " + DVD_MAX_SPIN_SPEED + " rpm.");
    }

    //Stores data on the DVD
    @Override
    public void storeData(String data) {
        // Implementation specific to DVD
        setContents(data);
    }

    //Reads data from DVD
    @Override
    public String readData() {
        // Implementation specific to DVD
        return getContents();
    }


    //Writes data to the DVD
    @Override
    public void writeData(String data) {
        // Implementation specific to DVD
        setContents(data);
    }

    // Provides DVD specific information about DVD
    @Override
    public String discInfo() {
        // Implementation specific to DVD
        return "DVD Name: " + getName() + ", Storage Capacity: " + getStorageCapacity() + " GB";
    }
}
