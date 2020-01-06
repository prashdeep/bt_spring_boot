package com.bt.domain;

import org.springframework.stereotype.Component;

@Component
public class CorporateCustomer extends Customer {

    @Override
    public void purchase(String itemName, double price) {
        System.out.println("Corporate customer purchasing the item "+itemName + " for price "+price);

    }
}