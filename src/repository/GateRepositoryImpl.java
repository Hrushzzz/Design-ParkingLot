package repository;

import exception.GateNotFoundException;
import models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepositoryImpl implements GateRepository {

    private Map<Integer, Gate> gateMap;
    private static int idCounter = 1;

    public GateRepositoryImpl() {
        this.gateMap = new HashMap<>();
    }

    @Override
    public Gate get(int id) {
        Gate gate = gateMap.get(id);
        if (gate == null) {
            throw new GateNotFoundException("Gate does not exist..!");
        }
        return gate;
    }

    @Override
    public void put(Gate gate) {
        gate.setId(idCounter++);
        gateMap.put(gate.getId(), gate);
        System.out.println("Gate " + gate.getId() + " has been created");
    }
}
