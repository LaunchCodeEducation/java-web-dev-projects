package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {

    private String genre;

    public DVD(String name, int capacity, String genre) {
        super(name, capacity);
        this.genre = genre;
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at 570-1600 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Playing awesome film:");
    }

    public void playVideo() {
        System.out.println("Playing a/n " + genre + " film.");
    }
}
