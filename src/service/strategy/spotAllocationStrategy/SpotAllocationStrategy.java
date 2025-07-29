package service.strategy.spotAllocationStrategy;

import models.ParkingLot;
import models.ParkingSpot;
import models.Vehicle;
import models.constants.ParkingSpotType;

public interface SpotAllocationStrategy {
    ParkingSpot allocateSpot(ParkingLot parkingLot, Vehicle vehicle, ParkingSpotType parkingSpotType);
}
