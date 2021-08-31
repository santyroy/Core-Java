package com.roy._12methods.hw;

import java.util.Map;
import java.util.HashMap;

public class RomanDecimal {

    public static void main(String[] args) {
        System.out.println(decimalToRoman(248));
        System.out.println(decimalToRoman(506));
        System.out.println(romanToDecimal("CCXLVIII"));
        System.out.println(romanToDecimal("CCC"));
        System.out.println(romanToDecimal("XXX"));
        System.out.println(romanToDecimal("MMMXLVIII"));
    }

    private static String decimalToRoman(int number) {
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousands = {"", "M", "MM", "MMM"};
        return thousands[number / 1000]
                + hundreds[(number % 1000) / 100]
                + tens[(number % 100) / 10]
                + units[(number % 10)];
    }

    private static int romanToDecimal(String roman) {

        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // CCXLVIII

        int result = 0;
        for (int i = 0; i < roman.length(); i++) {

            if (i > 0 && romanMap.get(roman.charAt(i)) > romanMap.get(roman.charAt(i - 1))) {
                result += romanMap.get(roman.charAt(i)) - (2 * romanMap.get(roman.charAt(i - 1)));
            } else {
                result += romanMap.get(roman.charAt(i));
            }
        }
        return result;
    }
}
