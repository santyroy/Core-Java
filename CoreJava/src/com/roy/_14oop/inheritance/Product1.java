package com.roy._14oop.inheritance;

public class Product1 {

    private int id;
    private String name;

    public Product1(String name) {
        this.name = name;
    }

    public int calculateRemainingAmount() {
        return 100;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product1[] listVariants() {
        // some code that fetches the variant products from database
        return new Product1[3]; // just a fake return object for the sake of example
    }

}
