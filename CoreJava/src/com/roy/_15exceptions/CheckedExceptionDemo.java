package com.roy._15exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CheckedExceptionDemo {

    public static void main(String[] args) {
        try {
            Files.readAllLines(Paths.get("path of an non existing file"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
