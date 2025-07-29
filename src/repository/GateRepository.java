package repository;

import models.Gate;

public interface GateRepository {
    Gate get(int id);
    void put(Gate gate);
}
