package com.shiny.generics.erased;

public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // gia = (Generic<Integer>[]) new Object[SIZE];
        // ClassCastException

        gia = (Generic<Integer>[]) new Generic[SIZE];
        gia[0] = new Generic<Integer>();
        System.out.println(gia[0]);
    }
}
