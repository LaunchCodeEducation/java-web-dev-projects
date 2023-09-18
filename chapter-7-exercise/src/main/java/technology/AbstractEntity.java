package technology;

public abstract class AbstractEntity {
    protected static int newId = 1;
    private final int id;

    public AbstractEntity(){
        this.id = newId;
    }

    public double getId(){
        return id;
    }



}
