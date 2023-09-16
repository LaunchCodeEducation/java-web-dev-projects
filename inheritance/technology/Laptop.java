package technology;

public class Laptop extends Computer{
    private Boolean hasTouchScreen;
    private Boolean isCool;
    public Laptop (String name, Integer memoryGb, Integer yearOfProduction, Boolean hasTouchScreen, Boolean isCool) {
        super(name, memoryGb, yearOfProduction);
        this.hasTouchScreen = hasTouchScreen;
        this.isCool = isCool;
    }

    public Boolean getHasTouchScreen() {
        return hasTouchScreen;
    }

    public Boolean getCool() {
        return isCool;
    }

    public void setCool(Boolean cool) {
        isCool = cool;
    }

    @Override
    public String toString(){
        String newLine = System.lineSeparator();
        return super.toString()+newLine+
                "Touchscreen capable? " + hasTouchScreen + newLine +
                "But is it cool? " + isCool;
    }
}
