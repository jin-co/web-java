package com.example.scheduler.config;

import org.jobrunr.scheduling.JobScheduler;

public class SchedulerConfig {
    @Inject
    private JobScheduler jobScheduler;

jobScheduler.enqueue(() -> myService.doWork());
}
