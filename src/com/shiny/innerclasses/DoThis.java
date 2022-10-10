package com.shiny.innerclasses;

public class DoThis {
    void f() {
        System.out.println("DoThis.f()");
    }

    public class Inner {
        public DoThis outer() {
            // 返回外部类对象引用
            return DoThis.this;
        }

        public Inner inner() {
            return Inner.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DoThis dt = new DoThis();
        DoThis.Inner dti = dt.inner();
        dti.outer().f();
        System.out.println(dt == dti.outer());
        System.out.println(dti == dti.inner());

        DoThis.Inner dti2 = dt.new Inner();
    }
}
