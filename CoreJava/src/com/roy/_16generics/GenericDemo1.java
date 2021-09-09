package com.roy._16generics;

public class GenericDemo1 {
    public static void main(String[] args) {
        String[] strings = {"one", "two", "three"};

        printArray(strings);

        Integer[] ints = {1, 2, 3};

        // compilation error, because printArray(String[] args) takes an array of String not Integer.
        printArray(ints);
    }

//    private static void printArray(String[] arr) {
//        for (String s : arr) {
//            System.out.println(s);
//        }
//    }

    // Generic method
    // One potential issue is <E> belongs to Object class so can only use methods of objects class
    private static <E> void printArray(E[] arr) {
        for (E element : arr) {
            System.out.println(element);
        }
    }
}
