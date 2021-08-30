package com.roy._12methods;

import java.util.Arrays;

public class PassByValueDemo {
    public static void main(String[] args) {
        int i = 10;

        // here the argument is a copy of original value
        // when the method is called the copy of i variable is stored in stack memory
        changeIntValue(i);
        System.out.println("i after changeIntValue():\t" + i);

        i = changeInt(i);
        System.out.println("i after changeInt():\t\t" + i);

        // array is an object, reference datatype
        int[] array = {1, 2, 3};

        System.out.println("array before changeArray():\t" + Arrays.toString(array));
        // here the argument is a copy of the reference of the original value
        // which means any change in property of the reference will modify the original
        changeArray(array);
        System.out.println("array before changeArray():\t" + Arrays.toString(array));

        clearArray(array);
        System.out.println("array before changeArray():\t" + Arrays.toString(array));
    }

    private static void changeIntValue(int i) {
        i += 100; // here the value is assigned to local i variable, not to local class variable
    }

    private static int changeInt(int i) {
        i += 100;
        return i;
    }

    // here the reference copy is send as parameter, so we still can refer the original object
    // and change its properties.
    private static void changeArray(int[] arr) {
        // arr and array refer to the same array in the heap memory
        arr[1] = 200;
    }

    // here the reference copy is send as parameter and when we point that reference to null
    // the original array still stays but this copied reference loses the pointer to the original object
    private static void clearArray(int[] arr) {
        // arr has no reference to the original array in the heap memory
        arr = null;
    }
}
