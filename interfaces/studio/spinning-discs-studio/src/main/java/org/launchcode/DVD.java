package org.launchcode;
import java.util.HashMap;

     public class DVD extends BaseDisc implements OpticalDisc {
         public DVD(int storageCapacity, int spinSpeed) {
             super(storageCapacity, spinSpeed);
         }

         @Override
         public void spinDisc() {
             System.out.println("A DVD spins at a rate of" + this.getSpinSpeed() + "rpm.");
         }

         @Override
         public void readDisc() {
             System.out.println("Readinggggg!!11");

         }

         @Override
         public void StorageData() {
             this.getDiscData();

         }

     }

         // TODO: Implement your custom interface.



    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

