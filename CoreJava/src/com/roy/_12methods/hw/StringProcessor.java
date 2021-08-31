package com.roy._12methods.hw;

import java.util.Arrays;

public class StringProcessor {
    public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
            "peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
            "james;Derek James;james@gmail.com" + System.lineSeparator() +
            "jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
            "gregory;Mike Gregory;gregory@yahoo.com";

    public static void main(String[] args) {
        System.out.println("===== Convert 1 demo =====");
        System.out.println(convert1(INPUT_DATA));

        System.out.println("===== Convert 2 demo =====");
        System.out.println(convert2(INPUT_DATA));

    }

    public static String convert1(String input) {
        String[] lines = input.split("\\n+");
        String output = "";
        for (int i=1; i<lines.length; i++) {
            String[] data = lines[i].split(";");
            output += data[0] + "==>" + data[2] + "\n";
        }
        return output;
    }


    public static String convert2(String input) {
        String[] lines = input.split("\\n+");
        String output = "";
        for (int i=1; i<lines.length; i++) {
            String[] data = lines[i].split(";");
            output += data[1] + " (email: " + data[2] + ")\n";
        }
        return output;
    }

}
