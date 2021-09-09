package com.roy._14oop.solid.i.problem;

public class InterfaceSegregationPrincipleDemo {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle plane = new Plane();

        car.drive();
        boat.sail();
        plane.fly();

        /*
        Here apart from drive, car also has sail and fly methods, similarly
        Here apart from sail, boat also has driver and fly methods, similarly
        Here apart from fly, plane also has sail and driver methods, which is violation of
        Interface segregation principle - which states each interface should be confined to
        particular business logic and smaller interfaces should be created and segregated from
        a single large interface.
         */
    }
}
