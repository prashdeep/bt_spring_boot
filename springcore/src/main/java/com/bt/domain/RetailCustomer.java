package com.bt.domain;

import org.springframework.stereotype.Component;

@Component
public class RetailCustomer extends  Customer {
    @Override
    public void purchase(String itemName, double price) {
        System.out.println("Retail customer purchasing the item "+itemName + " for price "+price);
    }
}