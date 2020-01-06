package com.bt.payment;

public class AmazonPay implements Payment {

    public void initialize(){
        System.out.println("Initialization logic ....");
    }

    public void pay(String from, String to, double amount) {
        System.out.println("Payment of "+ amount + " from "+ from + " to "+ to+ " Using Amazon Pay");
    }

    public void tearDown(){
        System.out.println("Tear down logic  ....");
    }
}