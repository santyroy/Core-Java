package com.roy._19functionalprogramming.lambda_and_methodreference;

@FunctionalInterface
public interface DistanceCalculator {

    double calculateDistance(City city1, City city2);

    // In Functional Interface it is forbidden to have two abstract methods
//    double calculateDistance();

    default void someDefaultMethod() {
    }

    static void someStaticMethod() {
    }
}
