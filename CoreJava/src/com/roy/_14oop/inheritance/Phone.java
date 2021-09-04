package com.roy._14oop.inheritance;

public class Phone extends Product1 {

    // Default constructor
    public Phone() {
        super("Nokia"); // call to the parent constructor should always go first within child constructor
        System.out.println("Some code");
    }

    public void ring() {
        System.out.println("Ring!");
    }

    @Override
    public Product1[] listVariants() {
        throw new UnsupportedOperationException();
    }

    public int calculateAmountOfVariants() {
        return super.listVariants().length;
    }
}
