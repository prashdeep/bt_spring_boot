package com.bt;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Nullable
    public  Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Inside the before Initialization logic of custom bean post processor ==> "+beanName);
        return bean;
    }

    @Nullable
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Inside the post Initialization logic of custom bean post processor ==> "+beanName);
        return bean;
    }
}