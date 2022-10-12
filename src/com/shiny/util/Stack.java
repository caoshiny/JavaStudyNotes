package com.shiny.util;

import java.util.LinkedList;
import java.util.Set;

/**
 * 用 LinkedList 实现栈
 * @param <T>
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();

    // 压栈
    public void push(T v) {
        storage.addFirst(v);
    }

    // 栈顶元素
    public T peek() {
        return storage.peek();
    }

    // 出栈
    public T poll() {
        return storage.poll();
    }

    // 判断栈是否为空
    public boolean empty() {
        return storage.isEmpty();
    }

    public String toString() {
        return storage.toString();
    }

    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        for (String s: "My dog is yao".split(" ")) {
            stringStack.push(s);
        }
        while (!stringStack.empty()) {
            System.out.println(stringStack.poll());
        }
        
    }
}
