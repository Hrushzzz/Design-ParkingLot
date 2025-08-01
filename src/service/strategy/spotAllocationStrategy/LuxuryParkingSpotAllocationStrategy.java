package service.strategy.spotAllocationStrategy;

import exception.NoAvailableParkingSpotException;
import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSpot;
import models.Vehicle;
import models.constants.ParkingSpotStatus;
import models.constants.ParkingSpotType;
import models.constants.VehicleType;

public class LuxuryParkingSpotAllocationStrategy implements SpotAllocationStrategy {
    @Override
    public ParkingSpot allocateSpot(ParkingLot parkingLot, Vehicle vehicle, ParkingSpotType parkingSpotType) {
        for (ParkingFloor floor : parkingLot.getParkingFloors()) {
            for (ParkingSpot spot : floor.getParkingSpots()) {
                if(spot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY)
                        && spot.getParkingSpotType().equals(parkingSpotType.LUXE)
                        && spot.getVehicle().equals(vehicle.getVehicleType().equals(VehicleType.LUXE))) {
                    return spot;
                }
            }
        }
        throw new NoAvailableParkingSpotException("LUXE ParkingLot is full :(");
    }
}
