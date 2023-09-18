package org.launchcode;

public interface OpticalDisc {

    // Constants
    double CD_MIN_SPIN_SPEED = 200;
    double CD_MAX_SPIN_SPEED = 500;
    double DVD_MIN_SPIN_SPEED = 570;
    double DVD_MAX_SPIN_SPEED = 1600;

    // Method signatures
    //This method signature represents the spinning behavior of optical discs. It's an essential behavior for both CDs and DVDs, but the specific implementation differs.
    void spinDisc();


    //This method signature represents storing data on the disc
    void storeData(String data);

    // This method signature represents reading data from the disc.
    String readData();

    //This method signature represents writing data to the disc
    void writeData(String data);

    //This method signature represents getting information about the disc, such as its name and storage capacity
    String discInfo();
}
