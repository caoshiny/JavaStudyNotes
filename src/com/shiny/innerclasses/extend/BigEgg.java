package com.shiny.innerclasses.extend;

public class BigEgg extends Egg{
    public class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk() constructor!");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}
