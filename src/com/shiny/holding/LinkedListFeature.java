package com.shiny.holding;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListFeature {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        LinkedList<Integer> emptyList = new LinkedList<>();
        System.out.println(integers);
        System.out.println(emptyList);
        System.out.println(integers.getFirst());
        System.out.println(integers.element());
        System.out.println(integers.peek());
        System.out.println(emptyList.peek());
        System.out.println(integers.remove());
        System.out.println(integers);
        System.out.println(integers.removeFirst());
        System.out.println(integers);
        System.out.println(integers.poll());
        System.out.println(integers);
        System.out.println(emptyList.poll());

        integers.addFirst(2);
        System.out.println(integers);
        integers.addLast(6);
        System.out.println(integers);
        integers.removeLast();
        System.out.println(integers);
    }
}
