package com.bt.payment;

import org.springframework.stereotype.Component;

@Component
public class PaytmPay implements Payment {

    public void pay(String from, String to, double amount) {
        System.out.println("Payment of "+ amount + " from "+ from + " to "+ to+ " Using Paytm Pay");
    }
}