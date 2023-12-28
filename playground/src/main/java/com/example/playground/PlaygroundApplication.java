package com.example.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SpringBootApplication
public class PlaygroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlaygroundApplication.class, args);
        Person person = new Person();
        Person.setTest("tom");
        Person person1 = new Person();
        Person.setTest("jack");

        System.out.println(person.getTest());
        System.out.println(person1.getTest());
    }

    public class Floor {
        private double width;
        private double length;

        public Floor(double width, double length) {
            if (width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }

            if (length < 0) {
                this.length = 0;
            } else {
                this.length = length;
            }

        }

        public double getArea() {
            return this.width * this.length;
        }
    }

    public class Carpet {
        private double cost;

        public Carpet(double cost) {
            if (cost < 0) {
                this.cost = 0;
            } else {
                this.cost = cost;
            }
        }

        public double getCost() {
            return cost;
        }
    }

    public class Calculator {
        private Floor floor;
        private Carpet carpet;

        public Calculator(Floor floor, Carpet carpet) {
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost() {
            return this.floor.getArea() * this.carpet.getCost();
        }
    }

    public class Point {
        private int x;
        private int y;

        public Point() {
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public class Wall {
        private double width;
        private double height;

        public Wall() {
        }

        public Wall(double width, double height) {
            if (width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }

            if (height < 0) {
                this.height = 0;
            } else {
                this.height = height;
            }
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            if (width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            if (height < 0) {
                this.height = 0;
            } else {
                this.height = height;
            }
        }

        public double getArea() {
            return this.height * this.width;
        }
    }

    public class SimpleCalculator {
        private double firstNumber;
        private double secondNumber;

        public double getFirstNumber() {
            return this.firstNumber;
        }

        public double getSecondNumber() {
            return this.secondNumber;
        }

        public void setFirstNumber(double firstNumber) {
            this.firstNumber = firstNumber;
        }

        public void setSecondNumber(double secondNumber) {
            this.secondNumber = secondNumber;
        }

        public double getAdditionResult() {
            return this.firstNumber + this.secondNumber;
        }

        public double getSubtractionResult() {
            return this.firstNumber - this.secondNumber;
        }

        public double getMultiplicationResult() {
            return this.firstNumber * this.secondNumber;
        }

        public double getDivisionResult() {
            if (this.secondNumber == 0) {
                return 0;
            }
            return this.firstNumber / this.secondNumber;
        }
    }

    public static class Person {
        private String firstName;
        private String lastName;
        private static String test;
        private int age;

        public static String getTest() {
            return test;
        }

        public static void setTest(String test) {
            Person.test = test;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age < 0 || age > 100) {
                this.age = 0;
            } else {
                this.age = age;
            }
        }

        public boolean isTeen() {
            if (this.age > 12 && this.age < 20) {
                return false;
            } else {
                return true;
            }
        }

        public String getFullName() {
            return this.firstName + " " + this.lastName;
        }
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        boolean onGoing = true;
        int count = 0;
        long sum = 0;
        long avg = 0;
        while (onGoing) {
            String inputOriginal = scanner.nextLine();
            try {
                long input = Long.parseLong(inputOriginal);
                count++;
                sum += input;
            } catch (Exception e) {
                avg = sum / count;
                System.out.println("SUM = " + sum + " AVG = " + avg);
                onGoing = false;
            }
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        double numberOfBucketCal = area / areaPerBucket;
        int numberOfBucket = (int) Math.ceil(numberOfBucketCal);
        return numberOfBucket + extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        double numberOfBucketCal = area / areaPerBucket;
        int numberOfBucket = (int) Math.ceil(numberOfBucketCal);
        return numberOfBucket;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double numberOfBucketCal = area / areaPerBucket;
        int numberOfBucket = (int) Math.ceil(numberOfBucketCal);
        return numberOfBucket;
    }

    public static String getInputFromConsole(int year) {
        String name = System.console().readLine("Name?");
        System.out.println("Hi " + name);
        String dateOfBirth = System.console().readLine("When were you born?");
        int age = year - Integer.parseInt(dateOfBirth);
        return "age: " + age;
    }

    public static String getInputFromScanner(int year) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
        System.out.println("When were you born?");
        String dateOfBirth = scanner.nextLine();
        int age = year - Integer.parseInt(dateOfBirth);
        return "age: " + age;
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1L;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double p1, double p2) {
        char[] s1 = Double.toString(p1).toCharArray();
        char[] s2 = Double.toString(p2).toCharArray();
        boolean result = true;
        boolean countStart = false;
        int decimalCount = 0;
        for (int i = 0; i < s1.length; i++) {
            if (decimalCount > 3) {
                break;
            }
            if (s1[i] == '.') {
                countStart = true;
            }
            if (countStart) {
                decimalCount++;
            }
            if (s1[i] != s2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = (hours / 24) % 365;
            long years = (hours / 24) / 365;
            long min = minutes % 60;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
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

//        if (year % 400 == 0) {
//            return true;
//        }

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
            if (newNum[i] != newNum[(newNum.length - 1) - i]) {
                result = false;
            }
        }
        return result;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        char[] newNum = Integer.toString(number).toCharArray();
        if (newNum.length > 1) {
            return newNum[0] - 48 + newNum[newNum.length - 1] - 48;
        } else {
            return newNum[0] - 48 + newNum[0] - 48;
        }
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

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int smaller = first < second ? first : second;
        for (int i = smaller; i > 0; i--) {
            if (first % i == 0 && second % i == 0) {
                return i;
            }
        }
        return 0;
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
        number = reverse(Math.abs(number));
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

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int megaByte = kiloBytes / 1024;
        int kilo = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + kilo + " KB");
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if (barking && hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasEqualSum(int n, int n2, int n3) {
        if (n + n2 == n3) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int n, int n2, int n3) {
        if ((n > 12 && n < 20) || (n2 > 12 && n2 < 20) || (n3 > 12 && n3 < 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int n) {
        if (n > 12 && n < 20) {
            return true;
        } else {
            return false;
        }
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.PI * Math.pow(radius, 2);
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigOne = bigCount * 5;

        if (goal >= bigOne + smallCount) {
            return true;
        } else if (goal >= bigOne) {
            return true;
        } else {
            return false;
        }
    }

    public static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        } else {
            for (int i = number; i > 0; i--) {
                if (isPrime(i) && number % i == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }
    }
}
