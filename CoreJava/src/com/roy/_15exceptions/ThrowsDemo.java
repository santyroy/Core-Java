package com.roy._15exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo {

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
//        demo.someMethod();
    }

    public void someMethod() throws FileNotFoundException {

    }
}

// custom exception class
class ThrowsDemoOverride extends ThrowsDemo {

    @Override
    public void someMethod() throws FileNotFoundException {

    }

    // we can only override exceptions which are compatible from the parent method
    // In this case we can specify either FileNotFoundException or child of it.
//    @Override
//    public void someMethod() throws IOException {
//
//    }


    // we can also omit throwing a new exception as well
//    @Override
//    public void someMethod() {
//
//    }
}
