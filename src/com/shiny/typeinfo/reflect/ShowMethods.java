package com.shiny.typeinfo.reflect;

import java.util.Arrays;

public class ShowMethods {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> c = Class.forName("com.shiny.typeinfo.factory.Part");
        System.out.println(Arrays.toString(c.getConstructors()));
        System.out.println(Arrays.toString(c.getMethods()));
    }
}
