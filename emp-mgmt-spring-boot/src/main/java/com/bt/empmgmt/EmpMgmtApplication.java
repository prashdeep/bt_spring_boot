package com.bt.empmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class EmpMgmtApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpMgmtApplication.class, args);
    }
}