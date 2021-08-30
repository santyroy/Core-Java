package com.roy._11controlstatements;

public class WhileLoopDemo {

    public static void main(String[] args) {
        System.out.println("============== While Loop ===============");

        int counter = 0;
        while(counter < 5) {
            System.out.println("counter: " + counter++);
        }

        // Infinite loop

//        while (true) {
//            System.out.println("Infinite loop");
//        }
    }
}
