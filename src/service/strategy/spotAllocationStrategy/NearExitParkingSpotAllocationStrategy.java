package service.strategy.spotAllocationStrategy;

import models.ParkingLot;
import models.ParkingSpot;
import models.Vehicle;
import models.constants.ParkingSpotType;

public class NearExitParkingSpotAllocationStrategy implements SpotAllocationStrategy {
    @Override
    public ParkingSpot allocateSpot(ParkingLot parkingLot, Vehicle vehicle, ParkingSpotType parkingSpotType) {
        return null;
    }
}
