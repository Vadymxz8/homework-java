package com.vadim.tkach.lesson22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    void maxDistance() {
//    given
        Vehicle vehicle = new Vehicle();
//when
        double getMaxDistance = vehicle.getMaxDistance();

//   then
        assertEquals(100.0, getMaxDistance);
    }
    @Test
    void mustDrive() {
//    given
        Vehicle vehicle = new Vehicle();
//when
        boolean canDrive = vehicle.canDrive();

//   then
        assertEquals(true, canDrive);
    }
}
