package com.bt.payment;

public class GooglePay implements Payment {

    public void pay(String from, String to, double amount) {
        System.out.println("Payment of "+ amount + " from "+ from + " to "+ to+ " Using Google Pay");
    }
}