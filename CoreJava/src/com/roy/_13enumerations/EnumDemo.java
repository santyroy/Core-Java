package com.roy._13enumerations;

public class EnumDemo {

    public static void main(String[] args) {

        Priority priority = Priority.HIGH;

        switch (priority) {
            case HIGH:
                System.out.println("High Priority");
                break;
            case MEDIUM:
                System.out.println("Medium Priority");
                break;
            case LOW:
                System.out.println("Low Priority");
                break;
        }


        System.out.println("================ Enum valueOf() ===============");
        // create enum based on user input
        Priority priority2 = Priority.valueOf("HIGH");
        System.out.println(priority2);

        // priority2 = Priority.valueOf("high"); // exception IllegalArgumentException - No enum constant


        System.out.println("================= Enum comparison ==============");
        System.out.println("priority2 == Priority.LOW: " + (priority2 == Priority.LOW)); // false
        System.out.println("priority2 == Priority.HIGH: " + (priority2 == Priority.HIGH)); // true



        /*
            public enum Priority { HIGH, MEDIUM, LOW; }
         */
        System.out.println("================= Enum Ordinals =================");
        System.out.println("Priority.LOW.ordinal(): " + Priority.LOW.ordinal());
        System.out.println("Priority.MEDIUM.ordinal(): " + Priority.MEDIUM.ordinal());
        System.out.println("Priority.HIGH.ordinal(): " + Priority.HIGH.ordinal());


        System.out.println("================= Enum Iteration =================");
        Priority[] priorities = Priority.values();
        for (Priority priority3: priorities) {
            System.out.println(priority3);
        }


        System.out.println("================= Enum fields and Methods =============");
        System.out.println("Month.JANUARY.getAmountOfDays(): " + Month.JANUARY.getAmountOfDays());
    }
}
