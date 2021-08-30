package com.roy._02primitives;

public class PrimitiveTypes {

    public static void main(String[] args) {
        byte b = 1;
        short s;
        s = 2;
        int i = 3;
        long l = 4;

        char c = 'a';

        boolean bool = true;

        float f = 1.2F;

        long l2 = 2_000_000_000_000L;

        double d = 1.3;

        // for a var keyword the compiler recognizes the variable type and assigns the value
        var v = 1; // here v has been considered as integer type, we cannot store and other value later
//        v = "hello"; // compile error - required int provided string
//        v = true; // compile error - required int provided boolean

        int i3 = s;

        char c2 = 100; // initialize to character which has value 100 in unicode table
        System.out.println(c2);

        // implicit casting - done by compiler
        double d2 = i3;
        System.out.println(d2);

        // explicit casting - done by programmer
        b = (byte) i3;
        System.out.println(b);

        // though by default all number values are int type
        // still on assigning 10 to byte compiler doesn't give error
        // because 10 also lies within the range of byte (-128, +127)
        byte b2 = 10;

        // overflow
        byte b3 = (byte) 128;
        System.out.println(b3); // -128

        long number = 499_999_999_000_000_001L;
        double converted = (double) number; // long to double
        System.out.println(converted);
        System.out.println(number - (long) converted);


        // Auto Boxing / Unboxing
        // Auto Boxing - automatic conversion which java compiler does for primitive types to its wrapper class
        // Un Boxing - automatic conversion which java compiler does for wrapper class to its primitive types

        Integer i4 = 1; // int was auto boxed to Integer
        int i5 = i4; // Integer was unboxed to int
    }
}
