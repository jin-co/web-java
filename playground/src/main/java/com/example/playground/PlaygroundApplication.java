package com.example.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DecimalFormat;

@SpringBootApplication
public class PlaygroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlaygroundApplication.class, args);
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);

        System.out.println("args = " + isCatPlaying(false, 35));
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1L;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printCoversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            Math.round(1.9);
        }
    }

    public static void areEqualByThreeDecimalPlaces(double p1, double p2) {
//        if(p1 == p2) {
//            return true;
//        }
        String s1 = Double.toString(p1 * 1000).split("\\.")[0];
        String s2 = Double.toString(p2 * 1000).split("\\.")[0];
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        }
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        long min = minutes % 60;
        System.out.println(min + " min = " + years + " y and " + days + " d");
    }

    public static void printEqual(int p1, int p2, int p3) {
        if(p1 < 0 || p2 < 0 || p3 < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if(p1 == p2 && p2 == p3) {
            System.out.println("All numbers are equal");
            return;
        }

        if(p1 != p2 && p2 != p3 && p1 != p3) {
            System.out.println("All numbers are different");
            return;
        }

        System.out.println("Neither all are equal or different");
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (!summer && temperature >= 25 && temperature <= 35) {
            return true;
        }

        if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        }

        return false;
    }
}
