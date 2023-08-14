package com.example.test.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StateServiceTest {

    @Test
    void stateServiceSingleton() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StateService bean1 = ac.getBean(StateService.class);
        StateService bean2 = ac.getBean(StateService.class);

        int userA = bean1.order("userA", 10000);
        int userB = bean2.order("userB", 30000);
//        int price = bean1.getPrice();
        System.out.println("price = " + userA);
//        Assertions.assertThat(bean1.getPrice()).isEqualTo(20000);
    }

    static class TestConfig {

        @Bean
        public StateService stateService() {
            return new StateService();
        }
    }

}