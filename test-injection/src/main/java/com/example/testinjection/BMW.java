package com.example.testinjection;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BMW implements Car {

    public BMW() {
    }

    @PostConstruct
    public void postConstruct() {

    }

    @PreDestroy
    public void preDestroy() {

    }

    @Override
    public String getModel() {
        return "BMW";
    }
}
