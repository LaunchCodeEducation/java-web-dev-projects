package main.java.org.launchcode;

import java.util.HashMap;

public class Cd extends InfoDiscs {

    int numTracks;
    public Cd (String name, HashMap <String, Integer> content, String typeOfDisc, double diameter, Integer rpm, int capacityGb, String currentFormat, double price, int numTracks) {
        super (name, content, typeOfDisc, diameter, rpm, capacityGb, currentFormat, price);
        this.numTracks = numTracks;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
