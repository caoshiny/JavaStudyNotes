package com.shiny.innerclasses.extend;

public class Egg2 {
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg2.Yolk() constructor!");
        }

        public void f() {
            System.out.println("Egg2.Yolk.f()");
        }
    }
    private Yolk y = new Yolk();
    public Egg2() {
        System.out.println("Egg2() constructor!");
    }

    public void insertYolk(Yolk yy) {
        y = yy;
    }

    public void g() {
        y.f();
    }
}
