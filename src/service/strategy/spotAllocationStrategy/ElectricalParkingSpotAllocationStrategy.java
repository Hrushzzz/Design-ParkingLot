package service.strategy.spotAllocationStrategy;

import exception.NoAvailableParkingSpotException;
import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSpot;
import models.Vehicle;
import models.constants.ParkingSpotStatus;
import models.constants.ParkingSpotType;
import models.constants.VehicleType;

public class ElectricalParkingSpotAllocationStrategy implements SpotAllocationStrategy {
    @Override
    public ParkingSpot allocateSpot(ParkingLot parkingLot, Vehicle vehicle, ParkingSpotType parkingSpotType) {
        for (ParkingFloor floor : parkingLot.getParkingFloors()) {
            for (ParkingSpot spot : floor.getParkingSpots()) {
                if(spot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY)
                        && spot.getParkingSpotType().equals(parkingSpotType.EV)
                        && spot.getVehicle().equals(vehicle.getVehicleType().equals(VehicleType.EV))) {
                    return spot;
                }
            }
        }
        throw new NoAvailableParkingSpotException("ELECTRICAL ParkingLot is full :(");
    }
}
