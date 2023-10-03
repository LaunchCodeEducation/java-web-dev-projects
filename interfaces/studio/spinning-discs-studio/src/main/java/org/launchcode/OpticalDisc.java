package org.launchcode;

public interface OpticalDisc {
    void spinDisc();
    void storeData(String data);
    void writeData(String data);
    String readData();
    String reportInformation();
}
