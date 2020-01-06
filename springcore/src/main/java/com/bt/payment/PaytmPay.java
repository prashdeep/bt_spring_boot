package com.bt.payment;

public class PaytmPay implements Payment {

    public void pay(String from, String to, double amount) {
        System.out.println("Payment of "+ amount + " from "+ from + " to "+ to+ " Using Paytm Pay");
    }
}