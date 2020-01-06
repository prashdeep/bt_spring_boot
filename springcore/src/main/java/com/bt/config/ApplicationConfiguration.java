package com.bt.config;

import com.bt.domain.Merchant;
import com.bt.payment.AmazonPay;
import com.bt.payment.Payment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public Payment payment(){
        return new AmazonPay();
    }


    @Bean("merchant")
    public Merchant instantiateMerchant(){
        Payment payment = payment();
        return  new Merchant(payment);
    }
}