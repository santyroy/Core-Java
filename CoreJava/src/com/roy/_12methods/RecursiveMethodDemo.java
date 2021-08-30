package com.roy._12methods;

public class RecursiveMethodDemo {

    /*
        Recursion - is a process in which the method calls itself continuously
     */
    public static void main(String[] args) {
        // throws java.lang.StackOverflowError - because each time the method is called a new frame is added
        // to stack memory, which finally becomes out of memory.
        // we need to finish method before releasing method in stack
//        callTheSameMethod();
        System.out.println("3! = " + calculateFactorial(3));
        System.out.println("4! = " + calculateFactorial(4));

        System.out.println("iterativeFactorial(4): " + iterativeFactorial(4));
    }

    private static void callTheSameMethod() {
        callTheSameMethod();
    }

    private static int calculateFactorial(int i) {
        if (i != 0) {
            return i * calculateFactorial(i - 1);
        } else {
            return 1;
        }
    }

    private static int iterativeFactorial(int n) {
        int factorial = 1;
        if (n < 0) {
            return -1;
        }
        for (int j = 1; j <= n; j++) {
            factorial *= j;
        }
        return factorial;
    }
}
