package com.shiny.generics;

public class GenericsMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericsMethods g = new GenericsMethods();
        g.f(" ");
        g.f(1.0);
        g.f(g);
    }
}
