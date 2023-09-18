package technology;

public class Laptop extends Computer {

    private double screenSize;
    private double ram;

    public Laptop(String operatingSystem, String brand, int yearRelease, double cost, double screenSize, double ram){
        super(operatingSystem, brand, yearRelease, cost);
        this.screenSize = screenSize;
        this.ram = ram;
        newId++;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public double getRam() {
        return ram;
    }

    @Override
    public String toString(){
        String newline = System.lineSeparator();
        return super.toString() +
                "Screen Size: " + screenSize + " inches" + newline +
                "Ram: " + ram + " G" + newline;
    }
}
