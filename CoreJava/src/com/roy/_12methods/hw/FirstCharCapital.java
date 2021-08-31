package com.roy._12methods.hw;

import java.util.Scanner;

public class FirstCharCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();


        System.out.println(firstCharToTitleCase(userInput));
    }

    public static String firstCharToTitleCase(String string) {
        String[] words = string.split("[\\s\\t]+");
        for (int i=0; i<words.length; i++) {
            String word = words[i];
            char[] wordArray = word.toCharArray();
            wordArray[0] = Character.toUpperCase(wordArray[0]);
            string = string.replace(word, String.valueOf(wordArray));
        }
        return string;
    }
}
