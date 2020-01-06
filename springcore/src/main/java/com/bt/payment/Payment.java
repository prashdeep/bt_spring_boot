package com.bt.payment;

@FunctionalInterface
public interface Payment {
    void pay(String from, String to, double amount);
}