package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Car testCar;

    @BeforeEach
    public void createCarObject() {
        testCar = new Car("Toyota", "Prius", 10, 50);
    }

    @AfterEach
    public void cleanup() {
        // Perform any cleanup tasks here (e.g., closing resources, resetting states)
    }

    @Test
    public void emptyTest() {
        assertEquals(10, 10, 0.001);
    }

    @Test
    public void testInitialGasTank() {
        assertEquals(10, testCar.getGasTankLevel(), 0.001);
    }

    // TODO: Add more test methods as needed for your Car class
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    //TODO: constructor sets gasTankLevel properly
    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception
}

