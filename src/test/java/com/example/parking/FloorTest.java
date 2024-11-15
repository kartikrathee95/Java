package com.example.parking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class FloorTest {

    private Floor floor;

    public FloorTest() {
        floor = new Floor(1, 10);
    }

    @Test
    public void testGetAvailableSpots() {
        List<ParkingSpot> availableSpots = floor.getAvailableSpots();
        assertEquals(10, availableSpots.size(), "All 10 spots should be available initially.");
    }

    @Test
    public void testUpdateAvailableSpotsPark() {
        List<ParkingSpot> availableSpots = floor.getAvailableSpots();
        ParkingSpot spotToPark = availableSpots.get(0);

        floor.updateAvailableSpots(spotToPark, "park");

        List<ParkingSpot> updatedAvailableSpots = floor.getAvailableSpots();
        assertEquals(9, updatedAvailableSpots.size(), "One spot should be occupied after parking a vehicle.");
        assertTrue(spotToPark.isOccupied(), "The parked spot should be occupied.");
        floor.updateAvailableSpots(spotToPark, "unpark");

    }

    @Test
    public void testUpdateAvailableSpotsUnpark() {
        List<ParkingSpot> availableSpots = floor.getAvailableSpots();
        System.out.println(availableSpots.size());
        ParkingSpot spotToPark = availableSpots.get(0);
        floor.updateAvailableSpots(spotToPark, "park");

        floor.updateAvailableSpots(spotToPark, "unpark");

        List<ParkingSpot> updatedAvailableSpots = floor.getAvailableSpots();
        assertEquals(10, updatedAvailableSpots.size(), "All spots should be available again after unpark.");
        assertFalse(spotToPark.isOccupied(), "The spot should not be occupied after unparking.");
    }

    @Test
    public void testGetTotalSpots() {
        List<ParkingSpot> totalSpots = floor.getTotalSpots();
        assertEquals(10, totalSpots.size(), "The total number of spots should be 10.");
    }

    @Test
    public void testSetFloorNumber() {
        floor.setFloor(2);
        assertEquals(2, floor.getFloor(), "The floor number should be updated to 2.");
    }

    @Test
    public void testFloorInitializationWithCorrectSpotTypes() {
        List<ParkingSpot> totalSpots = floor.getTotalSpots();

        int smallSpots = 0;
        int largeSpots = 0;
        int mediumSpots = 0;

        for (ParkingSpot spot : totalSpots) {
            switch (spot.getSize()) {
                case "Small":
                    smallSpots++;
                    break;
                case "Large":
                    largeSpots++;
                    break;
                case "Medium":
                    mediumSpots++;
                    break;
            }
        }
        assertEquals(2, smallSpots, "There should be 2 small spots.");
        assertEquals(2, largeSpots, "There should be 2 large spots.");
        assertEquals(6, mediumSpots, "There should be 6 medium spots.");
    }
}
