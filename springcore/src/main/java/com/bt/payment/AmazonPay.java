package com.bt.payment;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("amazonPay")
public class AmazonPay implements Payment {

    @PostConstruct
    public void initialize(){
        System.out.println("Initialization logic ....");
    }

    public void pay(String from, String to, double amount) {
        System.out.println("Payment of "+ amount + " from "+ from + " to "+ to+ " Using Amazon Pay");
    }

    @PreDestroy
    public void tearDown(){
        System.out.println("Tear down logic  ....");
    }
}