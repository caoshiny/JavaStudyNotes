package com.shiny.innerclasses.extend;

public class Egg {
    private Yolk y;
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk() constructor!");
        }
    }

    public Egg() {
        System.out.println("Egg() constructor!");
        y = new Yolk();
    }
}
