package com.shiny.innerclasses.extend;

/**
 * 继承内部类
 */
public class InheritInner extends WithInner.Inner {
    public InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner i = new InheritInner(wi);
        i.say();
    }
}
