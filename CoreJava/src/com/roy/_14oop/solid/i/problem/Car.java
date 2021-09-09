package com.roy._14oop.solid.i.problem;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car drives");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sail() {
        throw new UnsupportedOperationException();
    }
}
