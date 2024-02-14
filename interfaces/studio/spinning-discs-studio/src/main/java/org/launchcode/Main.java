package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD(700,500);
        myCD.spinDisc();
        myCD.readDisc();
        myCD.getDiscData();
        DVD myDVD = new DVD(4000,700);
        myDVD.spinDisc();
        myDVD.readDisc();


        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}