package com.roy._07operations;

import java.util.Scanner;

public class ReadFromConsole {

    public static void main(String[] args) {
        // System.in - default input stream from console, input stream blocks the main thread i.e. program execution stops
        // System.out - default output stream to console
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter any word: ");
        String word = sc.next(); // reads a word
//        String line = sc.nextLine(); // reads a line
        System.out.println("You entered this word: " + word);
        System.out.println("Please, enter any integer number: ");
        int i = sc.nextInt();
        System.out.println("You entered this integer number: " + i);
    }
}
