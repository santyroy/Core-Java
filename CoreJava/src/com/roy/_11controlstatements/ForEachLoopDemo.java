package com.roy._11controlstatements;

public class ForEachLoopDemo {

    /*
     * For Each Loop is also called Enhanced For Loop
     * Cannot change the direction of iteration in for each.
     */
    public static void main(String[] args) {
        System.out.println("=================== For Each Loop =====================");
        int[] arr = {1, 2, 3};
        int sum = 0;
        for (int number : arr) {
            sum += number;
            System.out.println("Number: " + number);
        }
        System.out.println("Sum: " + sum);
    }
}
