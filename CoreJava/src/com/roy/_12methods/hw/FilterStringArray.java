package com.roy._12methods.hw;

import java.util.Scanner;
import java.util.Arrays;

public class FilterStringArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any words separated by space: ");
        String userInput = sc.nextLine();
        System.out.print("Please, enter minimum word length to filter words: ");
        int minLength = sc.nextInt();

        String[] words = userInput.split("\\s+");
        String[] filteredWords = filterWordsByLength(minLength, words);
        System.out.println(Arrays.toString(filteredWords));
    }



    public static String[] filterWordsByLength(int minLength, String[] words) {
        String result = "";
        for(String word: words) {
            if(word.length() >= minLength) {
                result += word + ",";
            }
        }
		return result.split("[,]");
    }
}
