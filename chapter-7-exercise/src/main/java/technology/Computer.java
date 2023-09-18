package technology;

public class Computer  extends AbstractEntity{
    private String operatingSystem;
    private String brand;
    private int yearRelease;
    private double cost;

    public Computer(String operatingSystem, String brand, int yearRelease, double cost){
        this.operatingSystem = operatingSystem;
        this.brand = brand;
        this.yearRelease = yearRelease;
        this.cost = cost;

    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getBrand() {
        return brand;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;

    }

    @Override
    public String toString(){
        String newline = System.lineSeparator();
        return "Product Information: " + newline +
                "ID: " + getId() + newline +
                "OS: " + operatingSystem + newline +
                "Released: " + yearRelease + newline +
                "Price: $" + cost + newline;
    }
}
