package technology;

public class Computer {
    private String brand;
    private int storage;
    private int ramSize;

    public Computer(String brand, int storage, int ramSize) {
        this.brand = brand;
        this.storage = storage;
        this.ramSize = ramSize;
    }

    public void powerOn() {
        System.out.println("Computer powered on.");
    }

    public void powerOff() {
        System.out.println("Computer powered off.");
    }
}
