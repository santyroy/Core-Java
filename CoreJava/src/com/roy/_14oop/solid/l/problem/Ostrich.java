package com.roy._14oop.solid.l.problem;

public class Ostrich implements Bird {

    // Below is the violation of Liskov Substitution
    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void eat() {
        System.out.println("Ostrich eats");
    }
}
