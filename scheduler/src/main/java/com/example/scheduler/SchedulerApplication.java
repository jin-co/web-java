package com.example.scheduler;

import com.example.scheduler.service.CronEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class SchedulerApplication {

	public static void main(String[] args) throws InterruptedException {
		CronEngine cronEngine = new CronEngine();
		cronEngine.runTest();
//		SpringApplication.run(SchedulerApplication.class, args);
	}


}
