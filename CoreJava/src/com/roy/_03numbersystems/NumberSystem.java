package com.roy._03numbersystems;

public class NumberSystem {

    public static void main(String[] args) {
        int dec = 152; // Decimal declaration and possible chars are [0-9]
        int bin = 0b10011000; // Binary representation starts with 0B or 0b and possible chars are [0-1]
        int oct = 0230; // Octal declaration starts with 0 and possible chars are [0-7]
        int hex = 0x98; // // Hexadecimal declaration starts with 0X or 0x and possible chars are [0-9A-Fa-f]

        /*
         * Binary to Decimal
         * bin = 10011000 (radix=2)
         * dec = 1*2^7 + 0*2^6 + 0*2^5 + 1*2^4+ 1*2^3 + 0*2^2 + 0*2^1 + 0*0^0
         *     = 128 + 0 + 0 + 16 + 8 + 0 + 0 + 0
         *     = 152
         */

        /*
         * Octal to Decimal
         * oct = 0230 (radix=8)
         * dec = 0*8^3 + 2*8^2 + 3*8^1 + 0*8^0
         *     = 0 + 128 + 24 + 0
         *     = 152
         */

        /*
         * Hexadecimal to Decimal
         * hex = 0x98 (radix=16)
         * dec = 9*16^1 + 8*16^0
         *     = 144 + 8
         *     = 152
         */

        // print decimal value of the different number systems
        System.out.println(dec);
        System.out.println(bin);
        System.out.println(oct);
        System.out.println(hex);
    }
}
