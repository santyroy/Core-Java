package com.roy._05operators;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperationsWithIntegerAndDoubles {

    public static void main(String[] args) {
        int i = 20;
        System.out.println(i / 3); // 6 , because int/int = int
        System.out.println(i - (6 * 3)); // 2
        System.out.println((double)i / 3 ); // 6.6666666666667, because double/int = double

        // From the above result of 6.66666666667 the floating point value is very accurate
        // In order to restrict that we can use BigDecimal
        // The BigDecimal class provides operations for arithmetic, scale manipulation,
        // rounding, comparison, hashing, and format conversion.
        // The toString method provides a canonical representation of a BigDecimal.
        // The BigDecimal class gives its user complete control over rounding behavior.
        // If no rounding mode is specified and the exact result cannot be represented, an exception is thrown.
        BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2);
        BigDecimal amountOfPeople = BigDecimal.valueOf(3);
        BigDecimal chargePerPerson = rideFee.divide(amountOfPeople, RoundingMode.HALF_UP);
        System.out.println(chargePerPerson); // 6.67

        double d = 3.1;
        double d2 = 1.21;
        System.out.println(d - d2); // 1.8900000000000001

        BigDecimal bd3 = BigDecimal.valueOf(3.1).setScale(2);
        BigDecimal bd4 = BigDecimal.valueOf(1.21).setScale(2);
        System.out.println(bd3.subtract(bd4)); // 1.89
    }
}
