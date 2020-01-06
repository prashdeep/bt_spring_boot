package com.bt.domain;

import com.bt.payment.Payment;

public class Customer {

    private Payment payment;

    public Customer(Payment payment){
        this.payment = payment;
    }

    public void transaction(String from, String to, double amount){
        this.payment.pay(from,to, amount);
    }
}