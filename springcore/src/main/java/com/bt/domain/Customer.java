package com.bt.domain;

import com.bt.payment.Payment;

public class Customer {

    private Payment payment;

    private String name;

    private String gstNumber;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }

    public Customer(Payment payment){
        this.payment = payment;
    }

    public void transaction(String from, String to, double amount){
        this.payment.pay(from,to, amount);
    }
}