package technology;

public class Smartphone extends Computer{
    private Integer numLenses;
    public Smartphone(String name, Integer memoryGb, Integer yearOfProduction, Integer numLenses) {
        super(name, memoryGb, yearOfProduction);
        this.numLenses = numLenses;
    }

    @Override
    public String toString () {
        String newLine = System.lineSeparator();
        return super.toString() + newLine +
                "Number of Camera Lenses: " + numLenses;
    }

}
