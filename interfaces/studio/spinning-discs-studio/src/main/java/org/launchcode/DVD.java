package org.launchcode;

public class DVD {
    // TODO: Implement your custom interface.
// Define an abstract BaseDisc class
    abstract class BaseDisc<T> {
        private T data;
        private int capacityMB;

        // Constructor
        public BaseDisc(T data, int capacityMB) {
            this.data = data;
            this.capacityMB = capacityMB;
        }

        // Getter for data
        public T getData() {
            return data;
        }

        // Setter for data
        public void setData(T data) {
            this.data = data;
        }

        // Getter for capacity
        public int getCapacityMB() {
            return capacityMB;
        }

        // Setter for capacity
        public void setCapacityMB(int capacityMB) {
            this.capacityMB = capacityMB;
        }

        // Custom method
        public void displayInfo() {
            System.out.println("Data: " + data.toString());
            System.out.println("Capacity: " + capacityMB + " MB");
        }

        // Abstract method for playing
        public abstract void play();
    }

    // OpticalDisc interface
    interface OpticalDisc<T> extends Media<T> {
        void burn();

        void write();
    }

    // Media interface
    interface Media<T> {
        T getData();

        void setData(T data);

        void play();
    }

    // CD class extending BaseDisc and implementing OpticalDisc interface
    class CD<T> extends BaseDisc<T> implements OpticalDisc<T> {
        // Constructor
        public CD(T data, int capacityMB) {
            super(data, capacityMB);
        }

        @Override
        public void burn() {
            System.out.println("Burning data to CD: " + getData().toString());
        }

        @Override
        public void write() {
            System.out.println("Writing data to CD: " + getData().toString());
        }

        @Override
        public void play() {
            System.out.println("Playing CD: " + getData().toString());
        }
    }

    // DVD class extending BaseDisc and implementing OpticalDisc interface
    class DVD<T> extends BaseDisc<T> implements OpticalDisc<T> {
        // Constructor
        public DVD(T data, int capacityMB) {
            super(data, capacityMB);
        }

        @Override
        public void burn() {
            System.out.println("Burning data to DVD: " + getData().toString());
        }

        @Override
        public void write() {
            System.out.println("Writing data to DVD: " + getData().toString());
        }

        @Override
        public void play() {
            System.out.println("Playing DVD: " + getData().toString());
        }
    }

    public class MediaComparison {
        public void main(String[] args) {
            // Create a CD with String data
            CD<String> cd = new CD<>("CD Data", 700);
            cd.displayInfo();
            cd.play();
            cd.burn();
            cd.write();

            // Create a DVD with Integer data
            DVD<Integer> dvd = new DVD<>(123, 4700);
            dvd.displayInfo();
            dvd.play();
            dvd.burn();
            dvd.write();
        }
    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
