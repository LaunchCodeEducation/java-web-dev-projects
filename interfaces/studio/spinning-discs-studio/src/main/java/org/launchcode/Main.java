package org.launchcode;

public class Main {
    public static void main(String[] args) {

        BaseDisc cd = new CD("Greatest Hits", 750, "Queen");
        BaseDisc dvd = new DVD("Gladiator", 1500, "action");

        System.out.println(cd.getBasicInfo());
        System.out.println(dvd.getBasicInfo()+"\n");

        System.out.println(cd.writeData("We will rock you."));
        System.out.println(dvd.writeData("Are you not entertained?!?\n"));

        CD newCd = (CD) cd;
        newCd.spinDisc();
        System.out.println(newCd.getBasicInfo());
        newCd.playSong();
        System.out.println("\n");

        DVD newDvd = (DVD) dvd;
        newDvd.spinDisc();
        System.out.println(newDvd.getBasicInfo());
        newDvd.playVideo();
    }
}

