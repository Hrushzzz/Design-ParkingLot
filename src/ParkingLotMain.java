import models.ParkingLot;
import repository.*;
import service.InitializationService;

public class ParkingLotMain {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepositoryImpl();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepositoryImpl();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepositoryImpl();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepositoryImpl();

        InitializationService initializationService = new InitializationService(
                gateRepository, parkingLotRepository, parkingFloorRepository, parkingSpotRepository
        );
        initializationService.init();
    }
}
