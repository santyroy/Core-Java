package com.roy._12methods.hw;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer numbers separated by space: ");

        String[] strArray = sc.nextLine().split(" ");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        int maxInt = findMaxIntInArray(intArray);
        System.out.println("*** Initial Array ***");
        System.out.println(Arrays.toString(intArray));
        System.out.println("*** Max number in array ***");
        System.out.println(maxInt);
    }


    public static int findMaxIntInArray(int[] intArray) {

        int max = 0;
        if (intArray.length > 0) {
            max = intArray[0];
        }

        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        return max;

    }
}
