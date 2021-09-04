package com.roy._14oop.interfaces;

public class Client {

    private PaymentProcessor paymentProcessor;

    {
        paymentProcessor = new PayPalPaymentProcessor();
    }

    public void checkout(PaymentData paymentData) {
        //...some methods calls goes here
        paymentProcessor.processPayment(paymentData);
        PaymentProcessor.someStaticMethod();
    }

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
}
