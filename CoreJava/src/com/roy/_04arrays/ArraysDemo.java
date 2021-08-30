package com.roy._04arrays;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        // two ways to declare array
        int[] arr; // preferred way
        int arr2[]; // C-style array declaration

        // Arrays are object, hence new keyword tells JVM to allocate memory
        // and assign the address reference to the variable 'arr'
        arr = new int[10]; // default value - 10
        System.out.println(arr[0]); // default values of an array 0
        System.out.println(arr.length); // gives size of an array

        double[] arr3 = new double[10]; // default value - 0.0
        System.out.println(arr3[0]);

        boolean[] arr4 = new boolean[10]; // default value - false
        System.out.println(arr4[0]);

//        System.out.println(arr4[10]); // ArrayIndexOutOfBoundsException - there is no such index 10

        // array literal
        int[] arr5 = {4, 1, 3, 5, 2};

        // multidimensional array - an array of arrays
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(matrix[0][2]); // row=0, col=2

        int[][] matrix2 = new int[10][0];
        System.out.println(matrix2[0]); // output=address of inner array,
        // because matrix2[0] gives an array as an output, not a primitive value

        int[][] matrix3 = new int[10][];
        System.out.println(matrix3[0]); // output=null (inner array was not instantiated),
        // because matrix2[0] gives an array as an output, not a primitive value

        System.out.println(Arrays.toString(arr5));
        Arrays.sort(arr5); // manipulates the original array
        System.out.println(Arrays.toString(arr5));
    }
}
