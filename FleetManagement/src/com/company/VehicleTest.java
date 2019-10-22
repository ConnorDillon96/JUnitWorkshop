package com.company;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class VehicleTest {

    @Test
    public void testVehicle(){
        vehicle vehicle1 = new vehicle("SE65 LGF", 12);
        int expectedMiles = 12;
        int actualResultMile = vehicle1.getMileage();
        assertEquals(expectedMiles, actualResultMile);
    }

    @Test
    public void regCheck(){
        vehicle vehicle1 = new vehicle("SE65 LGF", 12);
        String expectedReg = "SE65 LGF";
        assertEquals(expectedReg, vehicle1.getRegistrationNumber());
    }

    @Test
    public void addMiles(){
        vehicle vehicle2 = new vehicle("SE65 LGF", 12);
        vehicle2.addTrip(20);
        int expectedMiles = 32;
        assertEquals(expectedMiles, vehicle2.getMileage());
    }

}