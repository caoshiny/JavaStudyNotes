package com.shiny.innerclasses.closure;

public class MyIncrement {
    public void increment() {
        System.out.println("MyIncrement.increment()");
    }

    static void f(MyIncrement mi) {
        mi.increment();
    }
}
