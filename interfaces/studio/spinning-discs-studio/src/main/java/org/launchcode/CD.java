package org.launchcode;


//This class extends BaseDisc and implements the OpticalDisc interface. It provides the specific implementation for CDs
public class CD extends BaseDisc implements OpticalDisc {

    public CD(String name, double storageCapacity) {
        super(name, storageCapacity);
    }

    //Overrides the spinDisc() method to provide CD-specific spinning behavior.
    //Implements the methods defined in the OpticalDisc interface for CD-specific behavior

    @Override
    public void spinDisc() {
        // Override spinDisc() method for CD
        System.out.println("A CD spins at a rate of " + CD_MIN_SPIN_SPEED + " - " + CD_MAX_SPIN_SPEED + " rpm.");
    }

    //Stores data on the CD.
    @Override
    public void storeData(String data) {
        // Implementation specific to CD
        setContents(data);
    }

    //Reads data from the CD.
    @Override
    public String readData() {
        // Implementation specific to CD
        return getContents();
    }

//Writes data to the CD.
    @Override
    public void writeData(String data) {
        // Implementation specific to CD
        setContents(data);
    }

    //Provides CD-specific information about the disc.
    @Override
    public String discInfo() {
        // Implementation specific to CD
        return "CD Name: " + getName() + ", Storage Capacity: " + getStorageCapacity() + " MB";
    }
}
