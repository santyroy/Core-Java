package com.roy._15exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        try {
            Files.readAllLines(Paths.get("path of an non existing file"));
        } catch (IOException e) {
            System.out.println("*** We are in catch block ***");
            System.out.println("*** We can log stack trace: " + Arrays.toString(e.getStackTrace()));

            e.getCause(); // get original exception
            e.getMessage(); // get message that is associate with the exception
            e.printStackTrace();
        }
    }
}
