package service;

import models.Gate;
import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSpot;
import models.constants.GateType;
import models.constants.ParkingLotStatus;
import models.constants.ParkingSpotStatus;
import models.constants.VehicleType;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class InitializationService {
    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public InitializationService(GateRepository gateRepository, ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository, ParkingSpotRepository parkingSpotRepository) {
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public ParkingLot init() {
        System.out.println(" *** Starting Initialization***");

        // Creating a ParkingLot object
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Hrushikesh Parking Lot");
        parkingLot.setAddress("Hrushikesh Mega Supreme Mall");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setCapacity(100);
        parkingLot.setVehicleTypesSupported(List.of(VehicleType.TWO_WHEELER, VehicleType.FOUR_WHEELER));

        List<ParkingFloor> floors = new ArrayList<>();
        // Running a loop to create 10 Parking Floor Objects
        for (int i = 1; i <= 10; i++) {
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setFloorNumber(i);
            List<ParkingSpot> spots = new ArrayList<>();
            //for each floor creating 10 parking spot objects
            for (int j = 1; j <= 10; j++) {
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setNumber((i * 100)+ j);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);
                spots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }
            parkingFloor.setParkingSpots(spots);

            // creating an entry gate object
            Gate entryGate = new Gate();
            entryGate.setId((i*1000) + 1);
            entryGate.setGateNumber(i*100 + 1);
            entryGate.setGateType(GateType.ENTRY_GATE);
            entryGate.setOperatorName("Operator : " + i + 1);
            parkingFloor.setEntryGate(entryGate);
            gateRepository.put(entryGate);

            // creating an exit gate object
            Gate exitGate = new Gate();
            exitGate.setId((i*1000) + 2);
            exitGate.setGateNumber(i*100 + 2);
            exitGate.setGateType(GateType.EXIT_GATE);
            exitGate.setOperatorName("Operator : " + i + 2);
            parkingFloor.setExitGate(exitGate);

            floors.add(parkingFloor);  // adding the floor to floor list
            parkingFloorRepository.put(parkingFloor);  // saving the floor to repository
        }

        parkingLot.setParkingFloors(floors);  // adding floor list to parking lot
        parkingLotRepository.put(parkingLot);
        return parkingLotRepository.get(1);
    }
}
