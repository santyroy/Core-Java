package com.roy._14oop.encapsulation;

import com.roy._14oop.encapsulation.package1.ClassA;

/*
    Encapsulation
    4 types of Access Modifiers
    - private   = local to the class
    - default   = used within same package
    - protected = used within same package + in the child class (extends)
    - public    = used everywhere outside
 */


public class Demo {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.doSomething(); // public modifier demo

//		classA.doSomething2(); // protected modifier demo
    }
}
