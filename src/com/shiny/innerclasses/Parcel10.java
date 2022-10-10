package com.shiny.innerclasses;

public class Parcel10 {
    public Destination destination(String dest, float price) {
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if(cost > 100)
                    System.out.println(cost + " Over budget!");
            }
            private String label = dest;
            public String readLabel() {
                return dest;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("shiny", 102.4f);
        System.out.println(d.readLabel());
    }
}
