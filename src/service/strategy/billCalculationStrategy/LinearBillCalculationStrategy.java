package service.strategy.billCalculationStrategy;

import models.ParkingLot;
import models.Ticket;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LinearBillCalculationStrategy implements BillCalculationStrategy {

    private static double BASIC_RATE = 50;
    private static double HOURLY_RATE = 40;

    @Override
    public double calculateAmount(ParkingLot parkingLot, Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();
        boolean basicRateCalculated = false;
        double amount = 0;

        long numberOfSeconds = ChronoUnit.SECONDS.between(entryTime, exitTime);
        while (numberOfSeconds > 0) {
            if(!basicRateCalculated) {
                amount += BASIC_RATE;
                basicRateCalculated = true;
            } else {
                amount += HOURLY_RATE;
            }
            numberOfSeconds = numberOfSeconds - 3600;
        }
        return amount;
    }
}
