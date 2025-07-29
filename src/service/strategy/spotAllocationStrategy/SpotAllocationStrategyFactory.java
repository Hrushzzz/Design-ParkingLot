package service.strategy.spotAllocationStrategy;

import static service.strategy.spotAllocationStrategy.AllocationStrategy.LINEAR;

public class SpotAllocationStrategyFactory {
    public static SpotAllocationStrategy getSpotAllocationStrategy(AllocationStrategy allocationStrategy) {
        return switch (allocationStrategy) {
            case LINEAR -> new LinearParkingSpotAllocationStrategy();
            case LUXURY -> new LuxuryParkingSpotAllocationStrategy();
            case ELECTRICAL -> new ElectricalParkingSpotAllocationStrategy();
        };
    }
}
