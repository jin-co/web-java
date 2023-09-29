package com.example.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class PlaygroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlaygroundApplication.class, args);
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        numberToWords(10);
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
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        long min = minutes % 60;
        System.out.println(min + " min = " + years + " y and " + days + " d");
    }

    public static void printEqual(int p1, int p2, int p3) {
        if (p1 < 0 || p2 < 0 || p3 < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (p1 == p2 && p2 == p3) {
            System.out.println("All numbers are equal");
            return;
        }

        if (p1 != p2 && p2 != p3 && p1 != p3) {
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

    public static String switchTest(String value) {
        switch (value) {
            case "1" -> {
                System.out.println("good");
                return "1";
            }
            case "2" -> {
                System.out.println("bad");
                return "2";
            }
            default -> {
                System.out.println("What");
                return "3";
            }
        }
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 400 == 0) {
            return true;
        }

        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }

        if (year < 1 || year > 9999) {
            return -1;
        }
        boolean leapYear = isLeapYear(year);
        int result = 0;

        switch (month) {
            case 1:
                result = 31;
                break;
            case 2: {
                if (leapYear) {
                    result = 28;
                } else {
                    result = 29;
                }
            }
            break;
            case 3:
                result = 31;
                break;
            case 4:
                result = 30;
                break;
            case 5:
                result = 31;
                break;
            case 6:
                result = 30;
                break;
            case 7:
                result = 31;
                break;
            case 8:
                result = 31;
                break;
            case 9:
                result = 30;
                break;
            case 10:
                result = 31;
                break;
            case 11:
                result = 30;
                break;
            case 12:
                result = 31;
                break;
        }
        return result;
    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > end || start < 0 || end < 0) {
            return -1;
        }
        for (var i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPalindrome(int number) {
        char[] newNum = Integer.toString(Math.abs(number)).toCharArray();
        boolean result = true;
        for (int i = 0; i < newNum.length; i++) {
            if (newNum[i] != newNum[newNum.length - i]) {
                result = false;
            }
        }
        return result;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        char[] newNum = Integer.toString(Math.abs(number)).toCharArray();
        return newNum[0] + newNum[newNum.length];
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number != 0) {
            int target = number % 10;

            if (target % 2 == 0) {
                sum += target;
            }
            number = number / 10;
        }
        return sum;
    }

    public static boolean hasSharedDigit(int p1, int p2) {
        if ((p1 < 10 || p1 > 99) || (p2 < 10 || p2 > 99)) {
            return false;
        }

        char[] p1Arr = Integer.toString(Math.abs(p1)).toCharArray();
        String p2Arr = Integer.toString(Math.abs(p2));

        for (int i = 0; i < p1Arr.length; i++) {
            if (p2Arr.indexOf(p1Arr[i]) != -1) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasSameLastDigit(int p1, int p2, int p3) {
        if ((p1 < 10 || p1 > 1000) || (p2 < 10 || p2 > 1000) || (p3 < 10 || p3 > 1000)) {
            return false;
        }

        int newP1 = p1 % 10;
        int newP2 = p2 % 10;
        int newP3 = p3 % 10;

        if (newP1 == newP2 || newP1 == newP3 || newP2 == newP3) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int num) {
        if (num < 10 || num > 1000) {
            return false;
        }
        return true;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int result = 0;
        int bigger = first > second ? first : second;
        for (int i = 0; i < bigger; i++) {
            if (first % i == 0 && second % i == 0) {
                result = i;
            }
        }
        return result;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            return true;
        }
        return false;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int total = getDigitCount(number);
        number = reverse(number);
        String[] output = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        for (int i = 0; i < total; i++) {
            System.out.println(output[number % 10]);
            number = number / 10;
        }
    }

    public static int reverse(int number) {
        char[] charArr = Integer.toString(number).toCharArray();
        String temp = "";
        for (int i = charArr.length; i > 0; i--) {
            temp += charArr[i - 1];
        }
        return Integer.parseInt(temp);
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        char[] charArr = Integer.toString(number).toCharArray();
        return charArr.length;
    }
}
