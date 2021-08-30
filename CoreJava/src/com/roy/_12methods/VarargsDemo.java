package com.roy._12methods;

public class VarargsDemo {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5)); // both calls varargs method
        System.out.println(sum(5)); // both calls varargs method

        System.out.println(String.format("Hello %s, your age is %d ", "Sougata", 28));
//        public static String format(String format, Object... args)
    }

    private static int sum(int i1, int i2) {
        return i1 + i2;
    }

    private static int sum(int i1, int i2, int i3) {
        return i1 + i2 + i3;
    }

    // recommended
    // here the params are variable args (varargs)
    private static int sum(int... n) {
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        return sum;
    }

    // wrong varargs method
    // because during runtime JVM should know which belongs to varargs and which belongs to other params
//    private static int sum(int...n, String s) {return 0;}

    // varargs should always be the last parameter in the method signature
    private static int sum(String s, int...n) {
        return 0;
    }
}
