package com.example.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(pubilc void addAccount())")
    public void beforeAddAccountAdvice() {
        System.out.println("@Before(\"execution(pubilc void addAccount())\")");
    }
}
