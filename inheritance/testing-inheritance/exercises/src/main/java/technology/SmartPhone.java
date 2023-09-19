package technology;

public class SmartPhone extends Computer {
    private String cameraResolution;

    public SmartPhone(String brand, int storage, int ramSize, String cameraResolution) {
        super(brand, storage, ramSize);
        this.cameraResolution = cameraResolution;
    }

    public void takePhoto() {
        System.out.println("Photo taken with " + cameraResolution + " camera.");
    }

}
