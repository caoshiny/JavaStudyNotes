package com.shiny.generics;

import java.util.ArrayList;

public class Shelf extends ArrayList<Product> {
    public Shelf(int nProduct) {
        for (int i = 0; i < nProduct; i++) {
            add(Product.generator.next());
        }
    }
}
