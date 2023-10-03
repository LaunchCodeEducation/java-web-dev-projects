package org.launchcode;

public abstract class BaseDisc implements OpticalDisc {
    private String name;
    private String discType;
    private String contents;

    // Constructors, getters, setters, and other common methods
    // ...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }


    @Override
    public abstract void spinDisc();

    @Override
    public void storeData(String data) {
        // Common method for storing data on the disc
        this.contents = data;
    }

    @Override
    public void writeData(String data) {
        // Common method for writing data to the disc
        storeData(data);
    }

    @Override
    public String readData() {
        // Common method for reading data from the disc
        return contents;
    }

    @Override
    public String reportInformation() {
        // Common method for reporting disc information
        return "Name: " + name + "\nType: " + discType + "\nContents: " + contents;
    }
}
