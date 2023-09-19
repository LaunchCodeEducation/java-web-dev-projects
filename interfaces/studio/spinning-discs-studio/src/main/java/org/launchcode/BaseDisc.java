package org.launchcode;


public abstract class BaseDisc {

    private final String name;
    private int capacity;

    private final String diskType;

    public BaseDisc(String name, int capacity,  String diskType) {
        this.name = name;
        this.capacity = capacity;

        this.diskType = diskType;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public String getDiskType() {
        return diskType;
    }

    @Override
    public String toString(){
        String newline = System.lineSeparator();
        return newline + name + " is a " + diskType + " has the capacity of " + capacity;
    }
}
