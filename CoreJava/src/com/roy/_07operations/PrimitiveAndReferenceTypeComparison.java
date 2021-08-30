package com.roy._07operations;

import java.util.Arrays;

public class PrimitiveAndReferenceTypeComparison {

    public static void main(String[] args) {
        // for primitives double equals (==) can be used for comparison
        int int1 = 128;
        int int2 = 128;

        System.out.println("int1 == int2: " + (int1 == int2)); // true
        System.out.println("1 == 2: " + (1 == 2)); // false
        System.out.println("65 == A: " + (65 == 'A')); // true

        // Wrapper class - reference type
        Integer i = 128;
        Integer i2 = 128;
        // == checks for the address location of the reference variables, not their values
        // if both address are same then returns true else false
        System.out.println("i == i2: " + (i == i2)); // false

        /*
         * From Java Integer Pool, if a value is boxed in the range from -128 to 127
         * then the result of two boxing conversion will be the same.
         * Which means both the references will point to the same value in the pool.
         * To optimize memory two Integer objects won't be created.
         * Instead, our variables will refer to Integer Pool where values from -128 to 127
         * are stored.
         * So two variables will refer to same object in heap memory.
         */
        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println("i3 == i4: " + (i3 == i4)); // true

        /*
         * Here we are explicitly asking java to create two separate objects in heap.
         * That is why both are different object reference.
         * This is not optimized and that is why it is not recommended
         * creating objects like this from JAVA 9.
         */
        Integer i5 = new Integer(127);
        Integer i6 = new Integer(127);
        System.out.println("i3 == i4: " + (i5 == i6)); // false


        /*
         * The below approach is recommended to create objects for Wrapper classes.
         * This ensures better space usage.
         */
        Integer i7 = Integer.valueOf(127);
        Integer i8 = Integer.valueOf(127);
        System.out.println("i7 == i8: " + (i7 == i8)); // true

        // IN ORDER TO COMPARE VALUE OF OBJECT WE USE equals() METHOD
        System.out.println("i.equals(i2): " + i.equals(i2)); // true

        // arrays are also reference types
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        System.out.println("arr1 == arr2: " + (arr1 == arr2)); // false
        System.out.println("arr1.equals(arr2): " + (arr1.equals(arr2))); // false, because equals method is properly implemented for arrays
        System.out.println("Arrays.equals(arr1, arr2): " + (Arrays.equals(arr1, arr2))); // true, because Arrays class has implemented equals method.

        arr1 = arr2;
        System.out.println(arr1 == arr2); // true, because both are pointing to same object in heap.
    }
}
