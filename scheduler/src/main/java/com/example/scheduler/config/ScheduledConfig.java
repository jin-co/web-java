package com.example.scheduler.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@Configuration
@EnableScheduling
public class ScheduledConfig {

    @Scheduled(fixedRate = 5000)
    public void excuteTask() {
        System.out.println("new Date() = " + new Date());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Scheduled(fixedRate = 1000)
    public void executeTask2() {
        System.out.println("Thread.currentThread().getName() + new Date() = " + Thread.currentThread().getName() + new Date());
    }
}
