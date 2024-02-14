package org.launchcode;
import java.util.HashMap;

  public class CD extends BaseDisc implements OpticalDisc {
      public CD(int storageCapacity, int spinSpeed) {
          super(storageCapacity, spinSpeed);
      }
      //public CD(int storageCapacity, int spinSpeed) {


          @Override
          public void spinDisc () {
              System.out.println("A CD spins at a rate of" + this.getSpinSpeed() + "rpm.");

          }

          @Override
          public void readDisc () {
              System.out.println("I am reading the data here");

          }

          @Override
          public void StorageData () {
              this.getDiscData();

          }
      }



        // TODO: Implement your custom interface.


        // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
        //  need to be declared separately.



