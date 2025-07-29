package service.strategy.spotAllocationStrategy;

import exception.NoAvailableParkingSpotException;
import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSpot;
import models.Vehicle;
import models.constants.ParkingSpotStatus;
import models.constants.ParkingSpotType;

public class LinearParkingSpotAllocationStrategy implements SpotAllocationStrategy {
    @Override
    public ParkingSpot allocateSpot(ParkingLot parkingLot, Vehicle vehicle, ParkingSpotType parkingSpotType) {
        for (ParkingFloor floor : parkingLot.getParkingFloors()) {
            for (ParkingSpot spot : floor.getParkingSpots()) {
                if(spot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY)
                        && spot.getVehicle().equals(vehicle.getVehicleType())) {
                    return spot;
                }
            }
        }
        throw new NoAvailableParkingSpotException("LINEAR ParkingLot is full :(");
    }
}
