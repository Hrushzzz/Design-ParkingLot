package repository;

import models.ParkingFloor;

public interface ParkingFloorRepository {
    ParkingFloor get(int id);
    void put(ParkingFloor parkingFloor);
}
