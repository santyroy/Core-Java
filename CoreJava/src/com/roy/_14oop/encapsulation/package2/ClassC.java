package com.roy._14oop.encapsulation.package2;

public class ClassC extends ClassB {

    /*
        Below code shows compilation error because ClassB extends Class A which has
        public doSomething(); method. Thus, on overriding it in ClassC we cannot demote
        the access modifier from public to protected.
     */


//    @Override
//    protected void doSomething() {
//
//	}

    // we can use the same/higher level of access modifier when overriding
    @Override
    public void doSomethingClassB() {

    }
}
