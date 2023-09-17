package com.example.scheduler;

import com.example.scheduler.config.ScheduledConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Timer;

@SpringBootApplication
public class SchedulerApplication {

    public static void main(String[] args) {
        ScheduledConfig scheduledConfig = new ScheduledConfig();
        scheduledConfig.excuteTask();
        scheduledConfig.executeTask2();
//        TimerExample t1 = new TimerExample("T1");
//        TimerExample t2 = new TimerExample("T2");
//
//        Timer t = new Timer();
//        t.scheduleAtFixedRate(t1, 0, 5 * 100);
//        t.scheduleAtFixedRate(t2, 0, 1000);

//        SpringApplication.run(SchedulerApplication.class, args);
    }

}
