package com.bt.client;

import com.bt.config.ApplicationConfiguration;
import com.bt.domain.Merchant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AnnotationConfigurationClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Merchant merchant = applicationContext.getBean("merchant", Merchant.class);

        merchant.getPayment().pay("Vinay", "Kishore", 8000);
        ((AbstractApplicationContext)applicationContext).registerShutdownHook();
    }
}