package com.shiny.generics.erased;

import java.awt.*;

public class Solid<T extends Dimension & HasColor & Weight> {
    T item;
    Solid(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    Color color() {
        return item.getColor();
    }

    int getX() {
        return item.x;
    }

    int weight() {
        return item.weight();
    }
}
