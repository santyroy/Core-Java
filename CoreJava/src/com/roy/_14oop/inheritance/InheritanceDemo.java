package com.roy._14oop.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Product1 product1 = new Phone();
        product1.setName("Nokia 1100");
        System.out.println("Product name: " + product1.getName());
        System.out.println("Remaining amount in stock: " + product1.calculateRemainingAmount());

//		product.ring(); // Compilation Error: because there is no ring method in Product interface, we need tto cast it

        Phone phone2 = new Phone();
        phone2.ring();

        // the solution for the compilation error would be
        if (product1 instanceof Phone) {
            Phone phone3 = (Phone) product1;
            phone3.ring();
        }

        System.out.println(phone2.calculateAmountOfVariants());
    }
}
