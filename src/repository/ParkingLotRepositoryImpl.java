package repository;

import exception.ParkingLotNotFoundException;
import models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepositoryImpl implements ParkingLotRepository {

    private Map<Integer, ParkingLot> parkingLotMap;
    private static int idCounter = 1;

    public ParkingLotRepositoryImpl() {
        this.parkingLotMap = new HashMap<>();
    }

    @Override
    public ParkingLot get(int parkingLotId) {
        ParkingLot parkingLot = parkingLotMap.get(parkingLotId);
        if (parkingLot == null) {
            throw new ParkingLotNotFoundException("ParkingLot does not exist..!");
        }
        return parkingLot;
    }

    @Override
    public void put(ParkingLot parkingLot) {
        parkingLot.setId(idCounter++);
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        System.out.println("ParkingLot " + parkingLot.getId() + " has been created..");
    }
}
