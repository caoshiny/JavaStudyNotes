package com.shiny.innerclasses;

/**
 * 初始化内部类
 */
public class Parcel9 {
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("shiny");
        System.out.println(d.readLabel());
    }
}
