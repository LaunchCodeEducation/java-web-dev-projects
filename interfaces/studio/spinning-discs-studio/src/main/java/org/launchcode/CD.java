package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {

    private String artist;


    public CD(String name, int capacity, String artist) {
        super(name, capacity);
        this.artist = artist;
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at 200-500 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("LET'S ROCK!");
    }

    public void playSong() {
        System.out.println("Playing song by " + artist);
    }
}
