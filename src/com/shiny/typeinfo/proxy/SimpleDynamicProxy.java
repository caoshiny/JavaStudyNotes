package com.shiny.typeinfo.proxy;

import java.lang.reflect.Proxy;

public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("boom");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);

        System.out.println("*********************************************");

        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(real));
        consumer(proxy);
    }
}
