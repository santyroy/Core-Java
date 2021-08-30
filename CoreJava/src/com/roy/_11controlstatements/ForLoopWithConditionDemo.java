package com.roy._11controlstatements;

public class ForLoopWithConditionDemo {

    public static void main(String[] args) {

        System.out.println("=============== For Loop ===============");
        for (int i = 0; i < 5; i++) {
            System.out.println("counter: " + i);
        }

        int c = 0;
        for (; c < 5; c++) {
            System.out.println("counter: " + c);
        }

        c = 0;
        for (; c < 5; ) {
            System.out.println("counter: " + c);
            c++;
        }

        // Infinite loop
//
//        for(;;){
//            System.out.println("infinite loop");
//        }

        System.out.println("================ For Loop | comma usage example ================");
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("counters: i = " + i + ", j = " + j);
        }
    }
}
