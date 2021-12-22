package add.console;

import AbstractClass.Bird;
import AbstractClass.Cat;
import AbstractClass.Parrot;
import Composition.*;
import Encapsulation.EncapsulatedPlayer;
import Encapsulation.Player;
import Inheritance.Animal;
import Inheritance.Dog;
import InnerClass.Gearbox;
import Interface.DeskPhone;
import Interface.ITelephone;
import Interface.MobilePhone;
import Polymorphism.*;

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

        //composition
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor monitor = new Monitor(
                "27inch Beast",
                "Acer",
                27,
                new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard(
                "BJ-200",
                "Asus",
                "v2.44",
                4,
                6);
        PC pc = new PC(theCase, monitor, motherboard);
        // calling with getters
//        pc.getMonitor().drawPixelAt(1500, 1200, "red");
//        pc.getMotherboard().loadProgram("Windows 1.0");
//        pc.getTheCase().pressPowerButton();
        pc.powerUp();

        //Encapsulation
        Player player = new Player();
        player.name = "Tim";
        player.health = 50;
        player.weapon = "sword";
        player.loseHealth(30);
        System.out.println(player.healthRemaining());

        EncapsulatedPlayer ePlayer = new EncapsulatedPlayer("Tim", 50, "sword");
        System.out.println(ePlayer.getHealth());

        //Polymorphism
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println(
                    "Movie #" + i + ": " + movie.getName() + "\n"
                    + "Plot: " + movie.plot() + "\n");
        }

        //Interface
        ITelephone timsPhone;
        timsPhone = new DeskPhone();
        DeskPhone sheatsPhone;
        sheatsPhone = new DeskPhone();
        timsPhone = new MobilePhone();
//        sheatsPhone = new MobilePhone();

        //Inner class
        Gearbox mxLaren = new Gearbox(6);
//        Gearbox.Gear first = mxLaren.new Gear(1, 12.4);
        mxLaren.addGear(1, 5.3);
        mxLaren.operateClutch(true);
        mxLaren.changeGear(1);
        mxLaren.operateClutch(false);

        //Abstract class
        Cat cat = new Cat("Yorkie");
        cat.breathe();

        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.fly();
    }

    //Polymorphism
    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Starwars();
            case 5:
                return new Forgettable();
        }
        return  null;
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
