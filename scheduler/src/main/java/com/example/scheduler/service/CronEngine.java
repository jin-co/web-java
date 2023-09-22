package com.example.scheduler.service;

import com.example.scheduler.config.SchedulerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CronEngine {

    @Scheduled(cron = "${interval-in-cron}")
    public void runTest() throws InterruptedException {
        System.out.println("run");
    }
}
