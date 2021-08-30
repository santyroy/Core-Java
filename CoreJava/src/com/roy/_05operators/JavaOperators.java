package com.roy._05operators;

public class JavaOperators {

    public static void main(String[] args) {

        // ======= Arithmetic Operator ========
        /*
         * Unary Operators
         * +, -, ++, --
         */
        System.out.println("============ Unary Arithmetic Operators ==========");
        int i = +10;
        int i2 = -10;
        int i3 = ++i; // value of i is incremented, used and then interpreter moves to next line
        int i4 = i++; // value of i is used and then incremented just before interpreter moves to next line
        int i5 = --i; // value of i is decremented, used and then interpreter moves to next line
        int i6 = i--; // value of i is used and then decremented just before interpreter moves to next line
        System.out.println("i = " + i);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);
        System.out.println("i5 = " + i5);
        System.out.println("i6 = " + i6);
        System.out.println("i = " + i);

        /*
         * Binary Operators
         * +, -, *, /, %, ^
         */
        System.out.println("=============== Binary Arithmetic Operators =============");
        int i7 = 10 + 1;
        int i8 = i7 - 1;
        int i9 = i8 / 2;
        int i10 = i9 % 2;
        int i11 = 5 % 10;
        int i12 = i10 * 3;
        int i13 = i7 ^ 2;

        System.out.println("i7 = " + i7);
        System.out.println("i8 = " + i8);
        System.out.println("i9 = " + i9);
        System.out.println("i10 = " + i10);
        System.out.println("i11 = " + i11);
        System.out.println("i12 = " + i12);
        System.out.println("i13 = " + i13);
        System.out.println("Hello " + "World " + "!"); // concatenation


        /*
         * Assignment Operators
         * =, +=, -=, *=, /=, %=
         */
        System.out.println("================= Assignment Operators ================");
        int i14 = 10;
        i14 += 2; // i14 = i14 +2
        System.out.println("i14 = " + i14);

        /*
         * Relational Operator
         * ==, !=, >, <, >=, <=
         */
        System.out.println("=============== Relational Operators ==============");
        int i15 = 10;
        int i16 = 20;
        System.out.println(i15 == i16);
        System.out.println(i15 != i16);
        System.out.println(i15 > i16);
        System.out.println(i15 < i16);
        System.out.println(i15 >= i16);
        System.out.println(i15 <= i16);

        /*
         * Logical Operators
         * &, &&, |, ||, !, ^ (XOR)
         */
        System.out.println("=============== Logical Operators ================");
//        System.out.println(false & (5/0 == 0)); // Runtime Exception
        System.out.println(false && (5 / 0 == 0)); // here only the first operand is checked and value is returned
//        System.out.println(true | (5/0 == 0)); // Runtime Exception
        System.out.println(true || (5 / 0 == 0)); // here only the first operand is checked and value is returned
        System.out.println("!true = " + !true);
        // ^ (XOR) -> TRUE = number of 'true' input is odd
        // ^ (XOR) -> FALSE = number of 'true' input is even
        System.out.println(true ^ true ^ true); // true
        System.out.println(true ^ false ^ true); // false
        System.out.println(false ^ true ^ false); // true


        /*
         * Bitwise Operators
         * &, |, ^ (XOR), ~ (Complement/Not), >> (Signed Right Shift), >>>(Unsigned Right shift), << (Left Shift)
         */
        System.out.println("==================== Bitwise Operators =================");
        System.out.println("4 & 5 = " + (4 & 5)); // 4
        /*
         * 4 = 1 0 0
         *     & & &
         * 5 = 1 0 1
         * ---------
         * 4 = 1 0 0
         */
        System.out.println("4 | 5 = " + (4 | 5)); // 5
        /*
         * 4 = 1 0 0
         *     | | |
         * 5 = 1 0 1
         * ---------
         * 4 = 1 0 1
         */
        System.out.println("4 ^ 5 = " + (4 ^ 5)); // 1
        /*
         * 4 = 1 0 0
         *     ^ ^ ^
         * 5 = 1 0 1
         * ---------
         * 4 = 0 0 1
         */
        System.out.println("~1 =" + ~1);
        System.out.println(Integer.toBinaryString(1)); // 00000000000000000000000000000001 (4bytes = 32bits)
        System.out.println(Integer.toBinaryString(-2)); // 11111111111111111111111111111110 (-ve because 1st bit is 1)
        System.out.println((byte)0b11111111111111111111111111111110); // -2 (-ve because 1st bit is 1)
        System.out.println((byte)0b00000000000000000000000010000000); // -128 = -(2^7) (-ve because 1st bit is 1)
        System.out.println((byte)0b00000000000000000000000011000000); // -64 = -(2^7) + (2^6) (-ve because 1st bit is 1)

        System.out.println("5 = " + 0b101);
        System.out.println("5 >>> 1 = " + (0b101 >>> 1)); // shift right all bits 1 place -> 010 = (2)

        int negativeByteValue = 0b11111111111111111111111110000000;
        System.out.println("-128 = " + negativeByteValue);
        System.out.println("-128 >>> 1= " + Integer.toBinaryString(negativeByteValue >>> 1)); // 01111111111111111111111111000000 (unsigned)
        System.out.println("-128 >> 1 = " + Integer.toBinaryString(negativeByteValue >> 1)); // 11111111111111111111111111000000 (signed)

        System.out.println("5 = " + 0b101);
        System.out.println("5 << 1 = " + (0b101 << 1)); // 00000000000000000000000000001010 = 10
        System.out.println("5 in binary format = " + Integer.toBinaryString(5));
        System.out.println("10 in binary format = " + Integer.toBinaryString(10));

        // Bit shifts are normally faster than arithmetic operations
        System.out.println("10 * 2 = 10 << 1 = " + (10 << 1)); // x << y = x * (2 ^ y)
        System.out.println("10 / 2 = 10 >> 1 = " + (10 >> 1)); // x >> y = x / (2 ^ y)

        /*
         * Ternary Operator
         * (condition) ? true : false
         */
        System.out.println("=============== Ternary Operator ============");
        System.out.println( 2 > 1 ? "2 is greater than one" : "2 is not less than one");
        System.out.println( 2 < 1 ? "2 is greater than one" : "2 is not less than one");
    }
}
