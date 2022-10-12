package com.shiny.holding;

import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(integers.getClass());
        System.out.println((Arrays.asList(1, 2, 3, 4, 5)).getClass());


        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(Arrays.toString(collection.toArray()));

        Integer[] moreInts = {6, 7, 8, 9 ,10};
        collection.addAll(Arrays.asList(moreInts));
        System.out.println(Arrays.toString(collection.toArray()));
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        System.out.println(Arrays.toString(collection.toArray()));
        Collections.addAll(collection, moreInts);
        System.out.println(Arrays.toString(collection.toArray()));

        List<Integer>  list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);
        System.out.println(list);
        // list.add(21);

        System.out.println(integers);
        ListIterator<Integer> integerListIterator = integers.listIterator();
        while (integerListIterator.hasNext()) {
            System.out.println(integerListIterator.next() + ", preId: " + integerListIterator.previousIndex() + ", nextId: " + integerListIterator.nextIndex());
        }

        while (integerListIterator.hasPrevious()) {
            System.out.println(integerListIterator.previous());
        }
    }
}
