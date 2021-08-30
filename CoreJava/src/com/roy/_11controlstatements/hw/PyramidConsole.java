package com.roy._11controlstatements.hw;

import java.util.Scanner;

public class PyramidConsole {

    public static void main(String[] args) {
        System.out.print("Please, enter height of the pyramid: ");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int fullHeight = height * 2;
        for (int i = 1; i < fullHeight; i++) {
            if (i <= height) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = fullHeight - i; j > 0; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}