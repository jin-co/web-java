package add.console;

import Inheritance.Animal;
import Inheritance.Dog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println(displayHighScorePosition("Tom", 3));
        System.out.println(calculateHighScorePosition(130));
        System.out.println(toMilesPerHour(20));
        System.out.println(Integer.parseInt("3"));
        System.out.println(Double.parseDouble("3"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter: ");
        String name = scanner.nextLine();

        System.out.print("Enter: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int year = scanner.nextInt();
            scanner.nextLine(); // handles enter key without this, it closes

            System.out.print("Enter: ");
            String hobby = scanner.nextLine();

            System.out.println(name + " " + year + " " + hobby);
        } else {
            System.out.println("invalid int");
        }
        scanner.close(); // close after using scanner

        //inheritance
        Animal animal = new Animal("Animal", 1, 1, "random");
        Dog dog = new Dog("Tom", 2, 2, 2, 10, 4);
        dog.eat();
    }

    public static String displayHighScorePosition(String playersName,int position) {
        return playersName + " managed to get into position " + position;
    }

    public static int calculateHighScorePosition(int score) {
        int scorePosition = 0;
        if (score > 1000) {
            scorePosition = 1500;
        } else if (score > 500) {
            scorePosition = 900;
        } else if (score > 100) {
            scorePosition = 400;
        } else {
            scorePosition = 50;
        }
        return scorePosition;
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long value = -1;
        if (kilometersPerHour >= 0) {
            value = Math.round(kilometersPerHour / 1.6);
        }
        return value;
    }
}
