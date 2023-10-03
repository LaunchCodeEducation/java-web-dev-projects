package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        CD myCd = new CD("Music CD", "CD-R");
        DVD myDvd = new DVD("Movie DVD", "DVD-RW");

        // Test common behaviors
        myCd.spinDisc();
        myDvd.spinDisc();

        myCd.storeData("Sample CD data");
        myDvd.storeData("Sample DVD data");

        System.out.println(myCd.readData());
        System.out.println(myDvd.readData());

        System.out.println(myCd.reportInformation());
        System.out.println(myDvd.reportInformation());
    }
}