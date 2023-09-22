package com.example.scheduler.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
//@ConditionalOnProperty()
@Configuration
@EnableAsync
@ConditionalOnProperty(name = "scheduler.enabled", matchIfMissing = true)
public class SchedulerConfig {

    /*The @Scheduled is a method-level annotation applied at runtime to mark the method to be scheduled.
    * It takes one attribute from cron, fixedDelay,
    * or fixedRate for specifying the schedule of execution in different formats
    *
    * conditions:
    * 1. it should be void
    * 2. There must not be any parameters
    * */


}
