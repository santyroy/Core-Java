package com.roy._19functionalprogramming.hw;

import java.util.Arrays;
import java.util.Scanner;

public class SortWordsInArray {

    public static void main(String[] args) {
        System.out.print("Please, enter words separated by space: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] words = userInput.split("\\s+");
        Arrays.sort(words, (w1, w2) -> -(w1.length() - w2.length())); // more length first
        System.out.println(Arrays.toString(words));
    }
}
