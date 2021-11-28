package com.roy._19functionalprogramming.predicates;

import com.roy._18collections.hw.DefaultProduct;
import com.roy._18collections.hw.Product;
import com.roy._18collections.hw.User;

import java.util.*;
import java.util.function.Predicate;

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

        System.out.println("================= Predicate.and() Demo ====================");

        removeProductsIfPriceIsMoreThanAndCategoryIsEqualTo(products, "Category 2", 50);
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("================= Predicate.isEqual() demo ====================");
        List<User> users = new ArrayList<>(List.of(
                new UserForHashTables(1, "John", "Smith",
                        "password", "john@email.com"),
                new UserForHashTables(2, "Ivan", "Ivanov",
                        "password", "ivan@email.com"),
                new UserForHashTables(1, "Harsh", "Anand",
                        "password", "harsh@email.com")));

        User criticalUser = new UserForHashTables(1, "John", "Smith",
                "password", "john@email.com");

        users.removeIf(Predicate.not(Predicate.isEqual(criticalUser)));
        System.out.println(users);

    }

    public static void removeProductsIfPriceIsMoreThan(List<? extends Product> products, double price) {
        products.removeIf(product -> product.getPrice() > price);
    }

    public static void removeProductsIfPriceIsMoreThanAndCategoryIsEqualTo(List<? extends Product> products,
                                                                           String category, double price) {

        Predicate<Product> isPriceIsMoreThan = product -> product.getPrice() > price;
        Predicate<Product> isCategoryEqualTo = product -> product.getCategoryName().equals(category);
        products.removeIf(isPriceIsMoreThan.and(isCategoryEqualTo));

        // negate() method demo
//        products.removeIf(isPriceIsMoreThan.and(isCategoryEqualTo.negate()));
    }
}

class UserForHashTables extends User {
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    public UserForHashTables(int id, String firstName, String lastName, String password, String email) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserForHashTables{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserForHashTables that = (UserForHashTables) o;
        return id == that.id
                && Objects.equals(firstName, that.firstName)
                && Objects.equals(lastName, that.lastName)
                && Objects.equals(password, that.password)
                && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, password, email);
    }
}
