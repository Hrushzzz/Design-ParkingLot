package repository;

import exception.ParkingFloorNotFoundException;
import models.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepositoryImpl implements ParkingFloorRepository {

    private Map<Integer, ParkingFloor> parkingFloorMap;
    private static int idCounter = 1;

    public ParkingFloorRepositoryImpl() {
        this.parkingFloorMap = new HashMap<>();
    }


    @Override
    public ParkingFloor get(int id) {
        ParkingFloor parkingFloor = parkingFloorMap.get(id);
        if (parkingFloor == null) {
            throw new ParkingFloorNotFoundException("ParkingFloor does not exist..!");
        }
        return parkingFloor;
    }

    @Override
    public void put(ParkingFloor parkingFloor) {
        parkingFloor.setId(idCounter++);
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        System.out.println("ParkingFloor with id " + parkingFloor.getId() + " has been created..");
    }
}
