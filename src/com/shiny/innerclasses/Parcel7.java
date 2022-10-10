package com.shiny.innerclasses;

/**
 * 匿名内部类
 */
public class Parcel7 {
    public Destination contents() {
        return new Destination() {
            // 匿名内部类
            private String s = "shiny";
            public String readLabel() {
                return s;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Destination d = p.contents();
        System.out.println(d.readLabel());
    }
}
