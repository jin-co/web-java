package add.console;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TextFileReader reader = new TextFileReader();
        List<String> lines = reader.readFromProjectPath("words_250.txt");

        // writing to console
//        lines.forEach(System.out::println);
//        System.out.println(lines);
//        lines.forEach(line -> System.out.println());
        for (String line: lines) {
            System.out.println(line);
        }

        System.out.println("------------------------------\n" +
                "words after removing special characters\n" +
                "------------------------------");
        for (var line: lines) {
            String wordsWithoutCharacters = line.replaceAll("[^a-zA-Z]+", "");
            System.out.println(wordsWithoutCharacters);
        }

        System.out.println("------------------------------\n" +
                "length -- number of words\n" +
                "------------------------------");

        for (var line: lines) {
            int length = line.length();
            System.out.println();
        }
    }
}
