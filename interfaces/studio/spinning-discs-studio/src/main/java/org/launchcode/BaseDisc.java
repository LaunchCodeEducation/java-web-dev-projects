package org.launchcode;

public abstract class BaseDisc {

    // Fields
    //name : Store the name of the disc
    private String name;

    //Store the storage capacity of the disc
    private double storageCapacity;

    //Store the data content of the disc
    private String contents;

    // Constructors
    //Initializes the name and storage capacity of the disc and sets the initial contents to an empty string.
    //Getters and Setters: Provide access to the fields.
    public BaseDisc(String name, double storageCapacity) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.contents = "";
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    // Custom Methods
    // Represents the common spinning behavior for all optical discs. This method is inherited by both CD and DVD classes but can be overridden.
    public void spinDisc() {
        // This method can be common for both CD and DVD
        System.out.println("A disc spins.");
    }

    //Represents the common behavior for ejecting a disc
    public void ejectDisc() {
        // Common method for ejecting a disc
        System.out.println("Ejecting the disc.");
    }

    //  An abstract method that forces subclasses (CD and DVD) to provide their own implementation to return information about the disc
    public abstract String discInfo();
}
