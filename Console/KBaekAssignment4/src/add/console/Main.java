package add.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
* Author: Kwangjin Baek
* Date: 2021. Dec. 15.
* Description: console application that reads data from file
* and shows the data to the console in three versions
* (original, without characters, with count of the letters in each word)
* */

public class Main {
    public static void main(String[] args) {
        TextFileReader reader = new TextFileReader();

        // user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileNameInput = "";
        System.out.print("Please enter file name: ");
        try {
            fileNameInput = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // getting data from file
        List<String> lines = reader.readFromProjectPath(fileNameInput);

        // writing to console (stage 1)
        for (String line: lines) {
            System.out.println(line);
        }

        // writing to console (stage 2)
        System.out.println("------------------------------\n" +
                "words after removing special characters\n" +
                "------------------------------");
        List<String> onlyWords = new ArrayList<>();
        for (var line: lines) {
            String onlyWord = line.replaceAll("[^a-zA-Z]+", "");
            onlyWords.add(onlyWord);
            System.out.println(onlyWord);
        }

        // writing to console (stage 3) with two variations
        System.out.println("------------------------------\n" +
                "length -- number of words\n" +
                "------------------------------");

        // including characters
        for (int i = 0; i < lines.size(); i++) {
            int length = lines.get(i).length();
            System.out.println(i + " " + lines.get(i) + " -- " + length + " " + "words");
        }

        // without characters
        for (int i = 0; i < onlyWords.size(); i++) {
            int length = onlyWords.get(i).length();
            System.out.println(i + " " + onlyWords.get(i) + " -- " + length + " " + "words");
        }
    }
}
