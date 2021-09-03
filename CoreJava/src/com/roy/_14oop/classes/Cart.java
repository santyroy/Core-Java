package com.roy._14oop.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Cart {
    private static final int DEFAULT_CART_CAPACITY = 10;
    private static final int MONEY_SCALE = 2;
    private static final double DEFAULT_TAX_RATE = 0.15;
    private static final String DEFAULT_TAX_TYPE = "incomeTax";
    private static final double DEFAULT_DISCOUNT_RATE = 0;
    private static final String DEFAULT_DISCOUNT_NAME = "zeroDiscount";

    private static int cartCounter;

    private int id;
    private int userId;
    private BigDecimal totalNetPrice;   // without tax
    private BigDecimal totalGrossPrice;   // with tax
    private BigDecimal totalTax;
    private Tax tax;
    private Product[] products;
    private int indexToAddNewProduct;
    private Discount discount;

    /*
     * Every time I created a cart object there would be few field which is need to be initialized.
     * This can be done within the initializing blocks.
     */

    // static initialization block
    // this would be only called once when the class is loaded in JVM
    // use: during driver initialization
    static {
        System.out.println("Cart.class is loaded in JVM");
    }

    // non-static initialization block
    // this would be called everytime an object is created
    // no matter which constructor is called, initialization block would definitely be called
    // before calling a constructor
    {
        cartCounter++;
        userId = 1;
        tax = new Tax(DEFAULT_TAX_TYPE, DEFAULT_TAX_RATE);
        discount = new Discount(DEFAULT_DISCOUNT_NAME, DEFAULT_DISCOUNT_RATE);
    }

    // constructors
    // - same name of that of class
    // - methods with no return type because it always returns reference to the object in heap memory
    // - used to instantiate objects
    // - if explicitly constructor is not defined Java Compiler automatically adds a default constructor to it
    public Cart() {
        System.out.println("Default constructor called");
    }

    // - if adding a custom constructor then defining a default constructor explicitly becomes mandatory
    public Cart(int id, int userId) {
        System.out.println("Parameterized constructor called");
        this.id = id;
        this.userId = userId;
    }

    // methods - define behavior of the objects
    public void addProduct(Product product) {
        if (product == null) {
            return;
        }
        if (products == null) {
            products = new Product[DEFAULT_CART_CAPACITY];
        }
        if (products.length < indexToAddNewProduct + 1) {
            products = Arrays.copyOf(products, products.length << 1);
        }
        products[indexToAddNewProduct++] = product;
        calculateTotalNetPrice();
        calculateTotalGrossPrice();
    }

    private BigDecimal calculateTotalNetPrice() {
        this.totalNetPrice = BigDecimal.valueOf(Arrays.stream(this.products)
                .mapToDouble(product -> product != null ? product.getPrice().doubleValue() : 0)
                .sum()).setScale(MONEY_SCALE, RoundingMode.HALF_UP);
        return this.totalNetPrice;
    }

    private BigDecimal calculateTotalGrossPrice() {
        if (this.totalNetPrice.doubleValue() < 0) {
            calculateTotalNetPrice();
        }
        BigDecimal orderDiscount = this.totalNetPrice
                .multiply(BigDecimal.valueOf(discount.getDiscountRate()))
                .setScale(MONEY_SCALE, RoundingMode.HALF_UP);
        this.totalTax = this.totalNetPrice.multiply(BigDecimal.valueOf(tax.getTaxRate()))
                .setScale(MONEY_SCALE, RoundingMode.HALF_UP);
        this.totalGrossPrice = this.totalNetPrice.add(this.totalTax).subtract(orderDiscount);
        return this.totalGrossPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            return;
        }
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    // not to give the direct reference of the actual product array
//	public Product[] getProducts() {
//		return products;
//	}

    // give a copy of the original product array to prevent data manipulation
    public Product[] getProducts() {
        return Arrays.copyOf(products, products.length);
    }

    public int getIndexOfLastProductAdded() {
        return indexToAddNewProduct;
    }

    public static int getCartCounter() {
        return cartCounter;
    }

    public BigDecimal getTotalNetPrice() {
        return totalNetPrice;
    }

    public BigDecimal getTotalGrossPrice() {
        return totalGrossPrice;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Cart [id=" + id + ", userId=" + userId + ", totalNetPrice="
                + totalNetPrice + ", totalGrossPrice=" + totalGrossPrice + ", totalTax="
                + totalTax + ", products=" + Arrays.toString(products)
                + ", indexOfLastProductAdded=" + indexToAddNewProduct + "]";
    }

    /*
     * Nested classes are the ones which logically come into existence if the outer class is present.
     * eg: if Cart exists only then Tax and Discount classes come into existence.
     */

    // nested non-static classes - INNER CLASS
    public class Discount {
        private String discountName;
        private double discountRate;

        public Discount(String discountName, double discountRate) {
            this.discountName = discountName;
            this.discountRate = discountRate;
        }

        public String getDiscountName() {
            return discountName;
        }

        public void setDiscountName(String discountName) {
            this.discountName = discountName;
        }

        public double getDiscountRate() {
            return discountRate;
        }

        public void setDiscountRate(double discountRate) {
            this.discountRate = discountRate;
        }
    }

    // nested static class
    public static class Tax {
        private String taxType;
        private double taxRate;

        public Tax(String taxType, double taxRate) {
            this.taxType = taxType;
            this.taxRate = taxRate;
        }

        public String getTaxType() {
            return taxType;
        }

        public void setTaxType(String taxType) {
            this.taxType = taxType;
        }

        public double getTaxRate() {
            return taxRate;
        }

        public void setTaxRate(double taxRate) {
            this.taxRate = taxRate;
        }


    }
}
