package com.roy._16generics;

import java.util.ArrayList;
import java.util.List;

/*
    Generic is only meant for the compiler, there is no generic during runtime because of TYPE ERASURE.
    Type Erasure can be explained as a process of enforcing type constraint only at compile time and
    discarding the element type information at runtime.
    That means during runtime objects of another type will appear in collection.
    => integers.get(0) gives a string output
 */

public class GenericDemo5 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        // here during runtime List<E> will be erased and List can take any object type not specifically E type
        List list = new ArrayList();

        list = integers; // list and integer is pointing out to same object in heap
        list.add("some string");

        Integer integer = integers.get(0); // integers.get(0) = "some string"
        System.out.println(integer);
    }
}
