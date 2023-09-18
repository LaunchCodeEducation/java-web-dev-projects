package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // Declare and initialize a CD and a DVD object.
        CD myCd = new CD("Sample CD", 700);
        DVD myDvd = new DVD("Sample DVD", 4.7);

        // Call each CD and DVD method to verify that they work as expected.
        myCd.spinDisc();
        myDvd.spinDisc();

        // Example usage of other methods:
        myCd.storeData("Data for CD");
        myDvd.storeData("Data for DVD");

        System.out.println("CD Contents: " + myCd.readData());
        System.out.println("DVD Contents: " + myDvd.readData());

        System.out.println(myCd.discInfo());
        System.out.println(myDvd.discInfo());
    }
}
