package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CarTest {
    //add BeforeEach so that we don't need to initialize new car object for each test
    @BeforeEach
    public void createCarObject() {
        Car test_car = new Car("Toyota", "Prius", 10, 50);
    }
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    //TODO: constructor sets gasTankLevel properly
    public void testInitialGasTank(){
        //Car test_car = new Car("Toyota", "Prius", 10, 50);
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    public void testGasTankAfterDriving(){
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    public void testGasTankAfterExceedingRange(){
        test_car.drive(5000);
        assertEquals(test_car.getGasTankLevel(), 0, .001);
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test()
    public void testGasOverfillException(){
        assertThrows(IllegalArgumentException.class, () -> test_car.addGas(5), "Shouldn't get here, car cannot have more gas in tank than the size of the tank"
        );
    }

}