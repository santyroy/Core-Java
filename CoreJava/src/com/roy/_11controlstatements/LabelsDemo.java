package com.roy._11controlstatements;

public class LabelsDemo {

    public static void main(String[] args) {
        System.out.println("================= Labels Demo ===================");
        loop1:
        for (int i = 0; i < 5; i++) {
            System.out.println("counter i: " + i);
            loop2:
            for (int j = 0; j < 5; j++) {
                System.out.println("counter j: " + j);
                if (j >= 0 && j < 3) {
                    System.out.println("continue loop2");
                    continue loop2;
                } else {
                    System.out.println("break loop1");
                    break loop1;
                }
            }
        }
    }

    /*
     Output
     
     ================= Labels Demo ===================
        counter i: 0
        counter j: 0
        continue loop2
        counter j: 1
        continue loop2
        counter j: 2
        continue loop2
        counter j: 3
        break loop1
     */
}
