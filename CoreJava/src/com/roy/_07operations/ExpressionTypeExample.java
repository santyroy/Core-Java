package com.roy._07operations;

public class ExpressionTypeExample {

    public static void main(String[] args) {
        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1;

        float f = 1.0F;
        double d = 1.0;

        char c = 1;

        int intExpression = b + b;
        // b+b (expression)
        // int intExpression = b + b; (statement)

        // an expression in java always gives an int value
        // byte byteExpression = b + b; // compilation error
        // int intExpression = l + l; // compilation error

        int intExpression2 = s + s;
        int intExpression3 = i + i;
        int intExpression4 = b + i + c;

        long longExpression = i + l;

        float floatExpression = l + f;

        double doubleExpression = f + d;

        System.out.println(10 / 3); // 3
        System.out.println(10.0 / 3); // 3.33333333333333333

        System.out.println("hello" + 1); // hello1 (any datatype + String =  String)
        System.out.println("hello " + null); // hello null

        /*
         * There is no such thing called plus(+) operator on bytecode level, so the compiler has to pick an operation.
         *
         * - The plus(+) operator which is applied to non-constant strings was compiled to a StringBuffer usage before JAVA 5.
         * - The plus(+) operator which is applied to non-constant strings was compiled to a StringBuilder usage in between JAVA 5 to JAVA 8.
         * - The plus(+) operator which is applied to non-constant strings was compiled to a strategy chose by jury via invokedynamic from JAVA 9.
         * - There are 6 strategies to string concatenation starting from JDK 9.
         */
    }
}
