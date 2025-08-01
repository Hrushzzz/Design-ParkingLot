package models;

import models.constants.BillStatus;

import java.time.LocalDateTime;

public class Bill extends BaseModel{
    private LocalDateTime exitTime;
    private double amount;
    private BillStatus billStatus;
    private Ticket ticket;
    private Gate exitGate;

    public Bill(){}

    public Bill(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, LocalDateTime exitTime, double amount, BillStatus billStatus, Ticket ticket, Gate exitGate) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.exitTime = exitTime;
        this.amount = amount;
        this.billStatus = billStatus;
        this.ticket = ticket;
        this.exitGate = exitGate;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }
}
