package main.java.org.launchcode;

public class NotEnoughMemoryException extends Exception{
    public NotEnoughMemoryException(int space) {
        super("Warning: this disc does not have the capacity to store " + space + " more megabytes of data");

    }
}
