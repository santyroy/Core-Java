package com.roy._19functionalprogramming.predicates;

import com.roy._18collections.hw.DefaultProduct;
import com.roy._18collections.hw.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PredicateDemo {

    public static void main(String[] args) {

        System.out.println("================= Predicate Demo ====================");

        List<Product> products = new ArrayList<>(List.of(
                new DefaultProduct(1, "Product 1", "Category 1", 99.99),
                new DefaultProduct(2, "Product 2", "Category 2", 149.99),
                new DefaultProduct(3, "Product 3", "Category 3", 39.99)
        ));

        removeProductsIfPriceIsMoreThan(products, 100);
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("================= BiPredicate Demo ====================");

        Map<Integer, Product> idProductMap = new HashMap<>();
        idProductMap.put(1, new DefaultProduct(1, "Product 1", "Category 1", 99.99));
        idProductMap.put(2, new DefaultProduct(2, "Product 2", "Category 2", 149.99));
        idProductMap.put(3, new DefaultProduct(3, "Product 3", "Category 3", 39.99));


        removeProductsIfPriceIsMoreThan(products, 100);
        for (Product product : products) {
            System.out.println(product);
        }

    }

    public static void removeProductsIfPriceIsMoreThan(List<Product> products, double price) {
        products.removeIf(product -> product.getPrice() > price);
    }
}
