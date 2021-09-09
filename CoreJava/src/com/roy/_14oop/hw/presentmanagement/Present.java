package com.roy._14oop.hw.presentmanagement;


import java.util.Arrays;
import java.util.Objects;

public class Present {

    private static final int DEFAULT_GIFT_CAPACITY = 10;
    private Sweet[] sweets;
    private int lastSweetsCount = 0;

    {
        sweets = new Sweet[DEFAULT_GIFT_CAPACITY];
    }

    public void addSweet(Sweet sweet) {
        if (sweet == null) {
            return;
        }

        // return new sweets array
        if (sweets.length <= lastSweetsCount) {
            sweets = Arrays.copyOf(sweets, sweets.length * 2);
        }
        sweets[lastSweetsCount++] = sweet;
    }

    public double calculateTotalWeight() {
        return Arrays.stream(sweets).filter(Objects::nonNull).mapToDouble(Sweet::getWeight).sum();
    }

    public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
        return Arrays.stream(sweets).filter(Objects::nonNull).filter(sweet -> sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight() <= maxSugarWeight).toArray(Sweet[]::new);
    }

    public Sweet[] getSweets() {
        return Arrays.stream(sweets).filter(Objects::nonNull).toArray(Sweet[]::new);
    }

}
