package technology;

public class SmartPhone extends Computer {

    private  double size;

    public SmartPhone(String operatingSystem, String brand, int yearRelease, double cost, double size){
        super(operatingSystem, brand, yearRelease, cost);
        this.size = size;
        newId++;
    }

    public double getSize(){
        return size;
    }

    @Override
    public String toString(){
        String newline = System.lineSeparator();
        return super.toString() +
                "Size: " + size + " inches" + newline;
    }

}


