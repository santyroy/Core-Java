package com.roy._14oop.interfaces;

/*
 * ChasePaymentProcessor is a CONCRETE class hence we need to override the abstract methods from interface.
 *
 * If it had been ABSTRACT class we needn't have to override the abstract method from interface
 */

public class ChasePaymentProcessor implements PaymentProcessor, PaymentValidator {

    @Override
    public void processPayment(PaymentData paymentData) {
        /* String secureToken = ChaseApi.requestSecureTokenForApp();
         * initPaymentPage(secureToken, payment.getPaymentAmount);
         * ...
         */
    }

    @Override
    public boolean validatePayment(PaymentData paymentData) {
        // code to validate payment goes here
        return false;
    }
}
