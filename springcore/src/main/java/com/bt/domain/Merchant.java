package com.bt.domain;

import com.bt.payment.Payment;

import java.util.List;

public class Merchant {

    private Payment payment;

    private String name;

    private String gstNumber;

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    private List<String> addresses;

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

    public Merchant(Payment payment){
        this.payment = payment;
    }

    public void transaction(String from, String to, double amount){
        this.payment.pay(from,to, amount);
    }
}