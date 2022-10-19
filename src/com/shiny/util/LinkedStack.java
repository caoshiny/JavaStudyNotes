package com.shiny.util;

public class LinkedStack<T> {
    private static class Node<U> {
        U item;
        Node<U> next;

        public Node() {
            item = null;
            next = null;
        }

        public Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next ==null;
        }
    }

    private Node<T> top = new Node<>();

    public void push(T item) {
        top = new Node<T>(item, top);
    }

    public T pop() {
        T result = top.item;
        if(!top.end())
            top = top.next;
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> ls = new LinkedStack<>();
        for(String s: "shiny is handsome!".split(" ")) {
            ls.push(s);
        }
        System.out.println(ls.pop());
        System.out.println(ls.pop());
        System.out.println(ls.pop());
    }
}
