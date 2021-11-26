package com.roy._19functionalprogramming.consumers;

import com.roy._18collections.hw.DefaultProduct;
import com.roy._18collections.hw.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumerDemo {

    public static void main(String[] args) {
        System.out.println("============== Consumer Demo ==================");

        List<Product> products = new ArrayList<>(List.of(
                new DefaultProduct(1, "Product 1", "Category 1", 99.99),
                new DefaultProduct(2, "Product 2", "Category 2", 149.99),
                new DefaultProduct(3, "Product 3", "Category 3", 39.99)
        ));

        increasePriceForProductList(products, 10);
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("============== BiConsumer Demo ==================");

        Map<Integer, Product> idProductMap = new HashMap<>();
        idProductMap.put(1, new DefaultProduct(1, "Product 1", "Category 1", 99.99));
        idProductMap.put(2, new DefaultProduct(2, "Product 2", "Category 2", 149.99));
        idProductMap.put(3, new DefaultProduct(3, "Product 3", "Category 3", 39.99));

        increasePriceForProductMap(idProductMap, 20);
        for (Product product : idProductMap.values()) {
            System.out.println(product);
        }


    }

    public static void increasePriceForProductList(List<? extends Product> products, double priceToIncrease) {
        products.iterator().forEachRemaining(product -> {
            product.setPrice(product.getPrice() + priceToIncrease);
        });
    }

    public static void increasePriceForProductMap(Map<Integer, ? extends Product> productMap, double priceToIncrease) {
        productMap.forEach((integer, product) -> {
            product.setPrice(product.getPrice() + priceToIncrease);
        });
    }
}
