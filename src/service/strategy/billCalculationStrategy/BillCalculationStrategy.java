package service.strategy.billCalculationStrategy;

import models.ParkingLot;
import models.Ticket;

public interface BillCalculationStrategy {
    double calculateAmount(ParkingLot parkingLot, Ticket ticket);
}
