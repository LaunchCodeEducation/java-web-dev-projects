package technology;

public class Computer {
    private String name;
    private Integer memoryGb;
    private Integer yearOfProduction;

    public Computer (String name, Integer memoryGb, Integer yearOfProduction) {
        this.name = name;
        this.memoryGb = memoryGb;
        this.yearOfProduction = yearOfProduction;
    }

    public String getName() {
        return name;
    }

    public Integer getMemoryGb() {
        return memoryGb;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return newLine + "Item Information: " + newLine +
        "Model name: " + name + newLine +
        "Memory: " + memoryGb + "gb" + newLine +
        "Made in " + yearOfProduction;
    }
}
