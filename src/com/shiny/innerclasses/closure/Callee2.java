package com.shiny.innerclasses.closure;

public class Callee2 extends MyIncrement {
    private int i = 0;
    public void increment() {
        super.increment();
        System.out.println(++i);
    }

    private class Closure implements Incrementable {
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference() {
        return new Closure();
    }
}
