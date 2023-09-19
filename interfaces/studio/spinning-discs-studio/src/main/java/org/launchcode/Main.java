package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        DVD dvd1 = new DVD("Matrix", 5, "DVD");
        DVD dvd2 = new DVD("Hackers", 2, "DVD");
        CD cd1 = new CD("Encanto Soundtrack", 200, "CD");
        CD cd2 = new CD("Frozen Soundtrack", 400, "CD");
        // TODO: Call each CD and DVD method to verify that they work as expected.

        System.out.println(cd1);
        System.out.println(dvd1);
        cd1.spinDisc();
        dvd2.spinDisc();


    }
}