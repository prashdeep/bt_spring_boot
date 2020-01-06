package com.bt.domain;

public class RetailCustomer extends  Customer {
    @Override
    public void purchase(String itemName, double price) {
        System.out.println("Retail customer purchasing the item "+itemName + " for price "+price);
    }
}