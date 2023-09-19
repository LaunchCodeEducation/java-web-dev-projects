package technology;
public class Laptop extends Computer {
    private double screenSize;

    public Laptop(String brand, int storage, int ramSize, double screenSize) {
        super(brand, storage, ramSize);
        this.screenSize = screenSize;
    }

    public void fold() {
        System.out.println("Laptop folded.");
    }

}

