package com.roy._14oop.inheritance;

public class ObjectInitializationOrder {

    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println("=====================");
        p = new Child();
    }

}


class Parent {
    static {
        System.out.println("Static init block parent");
    }

    {
        System.out.println("Init block parent");
    }

    public Parent() {
        System.out.println("Parent constructor");
    }

}

class Child extends Parent {
    static {
        System.out.println("Static init block child");
    }

    {
        System.out.println("Init block child");
    }

    public Child() {
        System.out.println("child constructor");
    }
}


/*
    Static init block parent
    Static init block child
    Init block parent
    Parent constructor
    Init block child
    child constructor

    =====================

    Init block parent
    Parent constructor
    Init block child
    child constructor
 */
