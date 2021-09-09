package com.roy._15exceptions;

import java.io.FileNotFoundException;

public class ThrowDemo {

    public static void main(String[] args) {
        ThrowDemo demo = new ThrowDemo();
        demo.transferMoney(null, null, 0);
    }

    public void transferMoney(Account from, Account to, double moneyToTransfer) {
        if (from == null || to == null || from.getMoney() < moneyToTransfer) {
//            throw new IllegalArgumentException();
//            throw new IllegalArgumentException("Invalid argument");
            throw new RuntimeException(new FileNotFoundException()); // wrap checked exception within unchecked exception
        }

        // and here goes money transferring logic
    }

    public void transferMoney2(Account from, Account to, double moneyToTransfer) {
        if (from == null || to == null) {
            throw new IllegalArgumentException();
        }
        if (from.getMoney() < moneyToTransfer) {
            throw new NotEnoughMoneyException();
        }

        // and here goes money transferring logic
    }
}

class Account {
    private double money;

    public double getMoney() {
        return money;
    }
}
