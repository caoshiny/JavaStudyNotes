package com.shiny.interfaces;

/**
 * 工厂设计模式
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory factory) {
        Service s = factory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        Factories.serviceConsumer(new Implementation1Factory());
        Factories.serviceConsumer(new Implementation2Factory());
    }
}
