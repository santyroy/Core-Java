package com.roy._15exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MultipleCatchBlock {

    public static void main(String[] args) {
        try {
            Files.readAllLines(Paths.get("path to non existing file"));
            Connection conn = DriverManager.getConnection("");
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

        // OR

        try {
            Files.readAllLines(Paths.get("path to non existing file"));
            Connection conn = DriverManager.getConnection("");
        } catch (IOException e) {
            System.out.println("Notify user that file does not exist and ask to re-enter new file.");
        } catch (SQLException e) {
            System.out.println("Notify user that there is an error with Database.");
        }

        /*
            If two exceptions come from same type hierarchy then we need to specify
            the most specific type first "FileNotFoundException" and then the
            generic type "IOException"
            FileNotFoundException is child of IOException
         */

        try {
            Files.readAllLines(Paths.get("path to non existing file"));
            var fr = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Notify user that file does not exist and ask to re-enter new file ");
        }

        // ========== unreachable catch block =================
        // compilation error
//        try {
//            Files.readAllLines(Paths.get("path to non existing file"));
//            var fr = new FileReader("file.txt");
//        } catch (IOException e) {
//            System.out.println("Notify user that file does not exist and ask to re-enter new file ");
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        }

    }
}
