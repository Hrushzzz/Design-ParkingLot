package models;

import models.constants.GateType;

public class Gate extends BaseModel {
    private int gateNumber;
    private GateType gateType;
    private String operatorName;

    public Gate() {}

    public Gate(int gateNumber, GateType gateType, String operatorName) {
        this.gateNumber = gateNumber;
        this.gateType = gateType;
        this.operatorName = operatorName;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
