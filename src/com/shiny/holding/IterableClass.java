package com.shiny.holding;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {
    protected String[] words = "And that is how we know the Earth to be banana-shaped.".split(" ");

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index ++];
            }
        };
    }

    public static void main(String[] args) {
        // 实现 iterable 接口可进行 foreach 迭代
        for (String s: new IterableClass()){
            System.out.print(s + " ");
        }
    }
}
