package com.example.scheduler;

import java.util.Date;
import java.util.TimerTask;

public class TimerExample extends TimerTask {
    private String name;

    public TimerExample(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + name + "new Date() = " + new Date());
        if ("t1".equalsIgnoreCase(name)) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
