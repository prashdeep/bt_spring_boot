package com.bt.client;

import com.bt.domain.Customer;
import com.bt.payment.AmazonPay;
import com.bt.payment.Payment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-configuration.xml");
         // Payment payment = new AmazonPay();

        //load the payment object from the context
        Customer customer = applicationContext.getBean("customer", Customer.class);
        customer.transaction("Kishore", "Vinay", 2000);
    }
}