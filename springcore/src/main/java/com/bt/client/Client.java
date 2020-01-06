package com.bt.client;

import com.bt.domain.Merchant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-configuration.xml");
         // Payment payment = new AmazonPay();

        //load the payment object from the context
        Merchant merchant = applicationContext.getBean("merchant", Merchant.class);
       // merchant.transaction("Kishore", "Vinay", 2000);

        merchant.getAddresses().forEach(System.out::println);
    }
}