package main.java.org.launchcode;

import java.util.HashMap;

public class Main {
    static HashMap<String, Integer> tracks1 = new HashMap<>();
    static HashMap<String, Integer> tracks2 = new HashMap<>();


    public static void main(String[] args) {
        tracks1.put("Cool time", 1);
        tracks2.put("So cool", 1);

        // TODO: Declare and initialize a CD and a DVD object.

        Cd music2Nite = new Cd("Hot Tracks", tracks1, "CD", 5, 300, 5, "mp3", 15, 1);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(music2Nite);
        System.out.println(music2Nite.addData(tracks2));
        System.out.println(music2Nite.content);

    }
}