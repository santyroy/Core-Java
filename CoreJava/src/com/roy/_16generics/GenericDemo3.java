package com.roy._16generics;

public class GenericDemo3<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericDemo3<Integer> integerBox = new GenericDemo3<>();
        GenericDemo3<String> stringBox = new GenericDemo3<>();

        integerBox.setT(10);
//        integerBox.setT("ten"); // compilation error

        stringBox.setT("hello world");
//        stringBox.setT(10); // compilation error

        Integer integer = integerBox.getT();
        String string = stringBox.getT();

        System.out.printf("Integer value: %d\n\n", integer);
        System.out.printf("String value: %s\n\n", string);
    }
}
