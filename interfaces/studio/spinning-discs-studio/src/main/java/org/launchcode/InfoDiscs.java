package main.java.org.launchcode;

import java.util.Collection;
import java.util.HashMap;

public abstract class InfoDiscs {

    //fields
    //name
    String name;
    //content
    HashMap<String, Integer> content = new HashMap<>();
    //type of disc;
    String typeOfDisc;
    //diameter
    double diameter;
    //optimal rpm--may come back and make this min rpm and max rpm
    Integer rpm;
    //storage capacity
    int capacityGb;
    //allowable data formats
    String [] dataFormats;
    String currentFormat;
    //num tracks/chapters

    //price
    double price;


    //methods
    //
    //store data
    //add data w/lasers
    //read data with lasers
    //once loaded, report information
    //rewrite/reformat
    //
    //constructor


    public InfoDiscs(String name, HashMap<String, Integer> content, String typeOfDisc,  double diameter, Integer rpm, int capacityGb, String currentFormat, double price) {
        this.name = name;
        this.content = content;
        this.typeOfDisc = typeOfDisc;
        this.diameter = diameter;
        this.rpm = rpm;
        this.capacityGb = capacityGb;
        //this.dataFormats = dataFormats;
        this.currentFormat = currentFormat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Integer> getContent() {
        return content;
    }

    public void setContent(HashMap<String, Integer> content) {
        this.content = content;
    }

    public String getTypeOfDisc() {
        return typeOfDisc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrentFormat() {
        return currentFormat;
    }

    public void setCurrentFormat(String currentFormat) {
        this.currentFormat = currentFormat;
    }

    public double getDiameter() {
        return diameter;
    }

    public Integer getRpm() {
        return rpm;
    }

    public int getCapacityGb() {
        return capacityGb;
    }

    public String[] getDataFormats() {
        return dataFormats;
    }

    @Override
    public String toString(){
        String newLine = System.lineSeparator();
        return "Title: " + name + newLine +
                "Type of Disc: " + typeOfDisc + newLine +
                "Optimal RPM: " + rpm + newLine +
                "Data Capacity: " + capacityGb + "gb" + newLine +
                "Price: " + price;
    }

    //reformat
    String reformat(String format) {
        setCurrentFormat(format);
        return "The data format has been changed to " + currentFormat;
    }

    //add data
    String addData(HashMap<String, Integer> data) {
        Integer occupiedStorage=0;
        Integer newDataSize=0;
        Collection <Integer> fileSizes = content.values();
        for (int size : fileSizes) {
            occupiedStorage += size;
        }
        Collection <Integer> fileSizesIncoming = data.values();
        for (int size : fileSizesIncoming) {
            newDataSize += size;
        }
        if(occupiedStorage + newDataSize < capacityGb) {
            content.putAll(data);
            return "The content of this disc now contains " + data.keySet();
        }
        else {
            return "Data cannot be added. Insufficient memory!";
        }
    }

    //store data

    //if loaded, report information
}
