package com.roy._19functionalprogramming.function_and_bifunction;

import java.util.*;
import java.util.function.Function;

public class FunctionsDemoCollections {

    private static final double DISCOUNT_RATE = 0.05;

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        System.out.println("============ Function type demo =============");
        System.out.println("map.get(4): " + map.get(4));
        map.computeIfAbsent(4, key -> Integer.toString(key));
        System.out.println("map.get(4): " + map.get(4));
        map.computeIfAbsent(5, FunctionsDemoCollections::convertIntToString);
        System.out.println("map.get(5): " + map.get(5));


        System.out.println("============ BiFunction type demo =============");
        map.computeIfPresent(3, (key, value) -> key + " -> " + value);
        System.out.println("map.get(3): " + map.get(3));
        map.computeIfPresent(2, FunctionsDemoCollections::combineIntToString);
        System.out.println("map.get(2): " + map.get(2));

        System.out.println("============ Compose Function type demo =============");
        Map<Product, Double> productDiscountMap = new HashMap<>();
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product(1, 23.56),
                new Product(2, 73.23),
                new Product(3, 10.78)));

        // composing few functions in runtime
        for (Product product: products) {
            // Func1
            Function<Product, Double> getPriceFunction = product2 -> product2.getPrice();
            // Func2
            Function<Double, Double> getDiscountFunction = price -> price * DISCOUNT_RATE;
            // Func3 - Func1 is called and then Func2 is called
            Function<Product, Double> getPriceAndThenDiscountFunction = getPriceFunction.andThen(getDiscountFunction);
            // Func4 - Func1 is called then composed with Func2
            Function<Product, Double> getPriceAndThenDiscountFunction2 = getDiscountFunction.compose(getPriceFunction);

            productDiscountMap.computeIfAbsent(product, getPriceAndThenDiscountFunction);
        }
        System.out.println(productDiscountMap);


        System.out.println("============ Comparator.comparing() demo =============");
        products.sort(Comparator.comparing(Product::getPrice)); // getPrice gives Double which internally implements Comparable interface
        products.sort(Comparator.comparing(product -> product.getPrice())); // same as above, only using lambda
        System.out.println(products);
    }

    private static String convertIntToString(int n) {
        return Integer.toString(n);
    }

    private static String combineIntToString(int k, String v) {
        return k + " -> " + v;
    }
}

class Product {
    private int id;
    private double price;

    public Product(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
