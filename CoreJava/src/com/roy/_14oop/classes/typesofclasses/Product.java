package com.roy._14oop.classes.typesofclasses;

/*
    - It is an abstract class which contains common properties and behaviors
    - In our online shopping application we do not want to make product a concrete class
      because there might be other products with specific set of attributes.
      eg: Master Product has a property "isAvailableForLease" (Kiwi)
          Variant Product has property "MasterProduct[] variants" (boots of different sizes)
 */


public abstract class Product {

    private int id;
    private String name;
    private int minOrderQuantity;
    private boolean isDeliveryAvailable;

    public abstract boolean isAvailableInStock();

    public int getRemainingAmountInStock() {
        // here goes some code which checks amount of product in DB
        return 100; // just a stub for the sake of example;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinOrderQuantity() {
        return minOrderQuantity;
    }

    public void setMinOrderQuantity(int minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }

    public boolean isDeliveryAvailable() {
        return isDeliveryAvailable;
    }

    public void setDeliveryAvailable(boolean isDeliveryAvailable) {
        this.isDeliveryAvailable = isDeliveryAvailable;
    }
}
