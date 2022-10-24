package com.shiny.generics.erased;

import java.awt.*;

public class Bounded extends Dimension implements HasColor, Weight{
    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int weight() {
        return 0;
    }

    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<>(new Bounded());
        System.out.println(solid.color());
        System.out.println(solid.getX());
        System.out.println(solid.weight());
    }
}
