package com.roy._14oop.interfaces;

public interface PaymentProcessor {

    int RETRY_ATTEMPTS = 5;

    // all method in an interface have modifier as - public abstract
    void processPayment(PaymentData paymentData);

    // default method can be overridden in child class but is not mandatory
    default void someDefaultMethod() {
        System.out.println("This is a default method");
    }

    // static method can be called as 'PaymentProcessor.someStaticMethod();' in child class
    static void someStaticMethod() {
        System.out.println("This is a static method");
    }
}
