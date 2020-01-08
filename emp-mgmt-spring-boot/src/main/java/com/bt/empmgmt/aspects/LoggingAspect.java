package com.bt.empmgmt.aspects;

import com.bt.empmgmt.model.Employee;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Configuration
public class LoggingAspect {

    @Before("execution(* com.bt.empmgmt.service.EmployeeServiceImpl.saveEmployee(..))")

    public void logBefore(JoinPoint joinPoint) {
        System.out.println("logging before the method is getting executed********");
    }


    @AfterReturning(pointcut = "execution(* findAllEmployees())", returning = "returnList")
    public void getNameReturningAdvice(List<Employee> returnList) {
        System.out.println("findAllEmployees executed. Returned List=" + returnList);
    }



}