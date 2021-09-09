package com.roy.test;

public class Main {

    public static void main(String[] args) {
        ClassA obj1 = new ClassB();
        ClassA obj2 = obj1;

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println("====================");

        obj1 = null;
        System.out.println(obj1);
        System.out.println(obj2);

        System.gc();

        System.out.println("====================");

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
