package add.console;

public class Main {

    public static void main(String[] args) {
	    System.out.println(displayHighScorePosition("Tom", 3));
        System.out.println(calculateHighScorePosition(130));
        System.out.println(toMilesPerHour(20));
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
