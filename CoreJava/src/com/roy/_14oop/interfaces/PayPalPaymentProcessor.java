package com.roy._14oop.interfaces;

/*
 * PayPalPaymentProcessor is a CONCRETE class hence we need to override the abstract methods from interface.
 *
 * If it had been ABSTRACT class we needn't have to override the abstract method from interface
 */


public class PayPalPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(PaymentData paymentData) {
        /* PayPalForm paymentForm = PayPalApi.getPaymentFormByAppId(APP_ID);
         * fillPaymentForm(paymentForm, payment);
         * paymentForm.submit();
         * ...
         */
    }
}
