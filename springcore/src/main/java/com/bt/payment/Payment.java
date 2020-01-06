package com.bt.payment;

public interface Payment {

    void pay(String from, String to, double amount);
}