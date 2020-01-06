package com.bt.client;

import com.bt.payment.AmazonPay;
import com.bt.payment.Payment;

public class Client {

    public static void main(String[] args) {
        Payment payment = new AmazonPay();
        payment.pay("Kishore", "Vinay", 2000);
    }
}