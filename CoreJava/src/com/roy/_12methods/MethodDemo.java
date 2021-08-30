package com.roy._12methods;

public class MethodDemo {

    public static void main(String[] args) {
        int sum = sum(1, 2);
        printToConsole(sum);
        printToConsole(sum(2.1, 3.5));
        printToConsole("Some text");
    }

    /*
        method_name(param1, param2) -> method signature
        eg: sum(int i1, int i2)

        access modifier and return type of methods are not considered in signature
        because of method overloading.

        method overloading - methods with same name but have different parameters.
     */

    private static int sum(int i1, int i2) {
        int result = i1 + i2;
        return result;
    }

    private static double sum(double d1, double d2) {
        return d1 + d2;
    }

    private static void printToConsole(int i) {
        System.out.println(i);
    }

    private static void printToConsole(double d) {
        System.out.println(d);
    }

    private static void printToConsole(String s) {
        System.out.println(s);
    }
}
