package com.shiny.innerclasses;

/**
 * 局部内部类
 */
public class Parcel5 {
    // 局部内部类
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;
            private PDestination(String whereTo) {
                label = whereTo;
            }
            public String readLabel() {
                return label;
            }
        }
        // 向上转型
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 parcel5 = new Parcel5();
        Destination destination = parcel5.destination("shiny");
        System.out.println(destination.readLabel());
    }
}
