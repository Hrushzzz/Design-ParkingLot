package repository;

import models.ParkingSpot;

public interface ParkingSpotRepository {
    ParkingSpot get(int parkingSpotId);
    void put(ParkingSpot parkingSpot);
}
