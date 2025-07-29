package repository;

import models.ParkingLot;

public interface ParkingLotRepository {
    ParkingLot get(int parkingLotId);
    void put(ParkingLot parkingLot);
}
