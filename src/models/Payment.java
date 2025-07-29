package models;

import models.constants.PaymentMode;
import models.constants.PaymentStatus;

import java.time.LocalDate;

public class Payment extends BaseModel{
    private int amount;
    private String transactionNumber;
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;
    private Bill bill;
    private LocalDate paymentDateTime;

    public Payment() {}

    public Payment(int amount, String transactionNumber, PaymentStatus paymentStatus, PaymentMode paymentMode, Bill bill, LocalDate paymentDateTime) {
        this.amount = amount;
        this.transactionNumber = transactionNumber;
        this.paymentStatus = paymentStatus;
        this.paymentMode = paymentMode;
        this.bill = bill;
        this.paymentDateTime = paymentDateTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public LocalDate getPaymentDateTime() {
        return paymentDateTime;
    }

    public void setPaymentDateTime(LocalDate paymentDateTime) {
        this.paymentDateTime = paymentDateTime;
    }
}
