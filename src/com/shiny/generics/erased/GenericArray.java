package com.shiny.generics.erased;

public class GenericArray<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArray(int sz) {
        System.out.println("1111");
        array = (T[]) new Object[sz];
        System.out.println("2222");
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] rep() {
        System.out.println("33333");
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> gai = new GenericArray<>(10);
        // Integer[] ia = gai.rep();
        Object[] io = gai.rep();
    }
}
