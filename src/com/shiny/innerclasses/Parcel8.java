package com.shiny.innerclasses;

/**
 * 带参匿名内部类
 */
public class Parcel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            public int value() {
                return super.value() * 4;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(8);
        System.out.println(w.value());
    }
}
