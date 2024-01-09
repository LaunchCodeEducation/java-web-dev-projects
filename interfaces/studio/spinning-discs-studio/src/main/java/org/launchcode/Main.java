package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
// Define an OpticalDisc interface
        interface OpticalDisc<T> extends Media<T> {
            // Constant fields
            int MAX_CAPACITY_MB = 700; // Example: CD capacity in megabytes
            int MAX_PLAYING_TIME_MINUTES = 80; // Example: Maximum playing time for CD in minutes

            // Method signatures
            void burn();

            void write();
        }

// Media interface
        interface Media<T> {
            T getData();

            void setData(T data);

            void play();
        }

// CD class implementing OpticalDisc interface
        class CD<T> implements OpticalDisc<T> {
            private T data;

            public CD(T data) {
                this.data = data;
            }

            //@Override
            public T getData() {
                return data;
            }

            //@Override
            public void setData(T data) {
                this.data = data;
            }

            //@Override
            public void play() {
                System.out.println("Playing CD: " + getData().toString());
            }

            @Override
            public void burn() {
                System.out.println("Burning data to CD: " + getData().toString());
            }

            @Override
            public void write() {
                System.out.println("Writing data to CD: " + getData().toString());
            }
        }

        class MediaComparison {
            public static void main(String[] args) {
                // Create a CD with String data
                CD<String> cd = new CD<>("CD Data");
                cd.play();
                cd.burn();
                cd.write();
            }
        }

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}