package com.bt.payment;

import org.springframework.stereotype.Component;

@Component
public class GooglePay implements Payment {

    public void pay(String from, String to, double amount) {
        System.out.println("Payment of "+ amount + " from "+ from + " to "+ to+ " Using Google Pay");
    }
}