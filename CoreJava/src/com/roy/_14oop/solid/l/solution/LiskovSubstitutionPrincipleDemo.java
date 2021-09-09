package com.roy._14oop.solid.l.solution;

public class LiskovSubstitutionPrincipleDemo {

    public static void main(String[] args) {
        Bird[] birds = new Bird[]{new Crow(), new Sparrow(), new Ostrich()};
        for (Bird bird : birds) {
            bird.eat();
        }

        System.out.println("\n================================\n");

        FlyingBird[] flyingBirds = new FlyingBird[]{new Crow(), new Sparrow()};
        for (FlyingBird bird : flyingBirds) {
            bird.fly();
        }
    }
}
