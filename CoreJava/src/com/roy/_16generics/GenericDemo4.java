package com.roy._16generics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo4 {

    public static void main(String[] args) {
        List<Parent> parents = new ArrayList<>();
        List<Child> children = new ArrayList<>();
        List<GrandChild> grandChildren = new ArrayList<>();

//        processParentElements(children); // compilation error: because List<Child> is not same as List<Parent>

        processElements(parents);
        processElements(children);
        processElements(grandChildren);

        Child child = children.get(0);
        child.childSpecificMethod();


        List<Parent> parents2 = new ArrayList<>();
        List<Child> children2 = new ArrayList<>();

        processElements2(parents);
        processElements2(children2);

        List<GrandChild> grandChildren2 = new ArrayList<>();
//        processElements2(grandChildren2); // compilation error

        Child child2 = children.get(0);
        child2.childSpecificMethod();


    }

    private static void processParentElements(List<Parent> parents) {
    }

    // ? - wild card and can be treated as any type (UPPER BOUNDED WILD CARD)
    // generally used to traverse each element, no modification can be done on passed list
    // here ? extends Parents means - we can pass anything which is either Parent or child of class Parent
    // Parent class and below
    private static void processElements(List<? extends Parent> elements) {
        Parent parent = elements.get(0);

        /*
            There is compilation error because it does not guarantee that during runtime
            what list would be passed in the method argument. Hence, we should always use
            Parent type as a variable to catch the values.
            Also Parent doesn't have all methods which are present in Child class
         */

//        Child child = elements.get(0); // compilation error


        /*
            Because we don't know what type of list would come as an argument thus,
            Java is restricting such interactions. It can happen that we pass parent list
            and internally want to add child object and vice versa.
            Also, let's say we add parent and child types of objects so while interacting
            with each type there would be different methods for parent and child objects
            which would violate homogenous nature of list.
         */
//        elements.add(new Parent()); // compilation error
//        elements.add(new Child()); // compilation error
//        elements.add(new GrandChild()); // compilation error

        elements.add(null);
    }

    // ? - wild card and can be treated as any type (LOWER BOUNDED WILD CARD)
    // generally used to add elements to the passed list
    // here ? super Child means - we can pass anything which is either Child or Super Class of Child
    // Child class and above
    private static void processElements2(List<? super Child> elements) {
        /*
            Here we don't know what would come as argument either Child or Parent or Object
            because Object is super type of Parent.
         */
//        Child child = elements.get(0);
//        Parent parent = elements.get(0);
        Object obj1 = elements.get(0);

        // suppose list is of Child we can add Child objects as well as GrandChild objects
        elements.add(new Child());
        elements.add(new GrandChild());
        elements.add(null);

        // let's say you pass List<Child> as argument and trying to add Parent object
//        elements.add(new Parent()); // compilation error
        // let's say you pass List<Child> as argument and trying to add Object object
//        elements.add(new Object()); // compilation error
    }
}

class Parent {
}

class Child extends Parent {
    public void childSpecificMethod() {
    }
}

class GrandChild extends Child {
}
